package org.knit.jnbovfavhk.sem1.lab2;

import java.util.Arrays;
import java.util.Objects;

public class Folder extends FileSystemComponent{

    private FileSystemComponent[] content;
    private int countOfElements;

    public Folder(String name) {
        super(name);
        content = new FileSystemComponent[8];
        countOfElements = 0;
    }

    public void add(FileSystemComponent component) {
        size += component.getSize();
        try {
            content[countOfElements] = component;
        }
        catch (ArrayIndexOutOfBoundsException err) {
            FileSystemComponent[] oldContent = content.clone();
            content = new FileSystemComponent[oldContent.length * 2];
            System.arraycopy(oldContent, 0, content, 0, oldContent.length);
            content[countOfElements] = component;
        }
        countOfElements += 1;
    }

    public void remove(FileSystemComponent component) {
        for (int i = 0; i < Arrays.stream(content).filter(Objects::nonNull).toArray().length; i++) {
            if (content[i].equals(component)) {
                FileSystemComponent[] oldContent = content.clone();
                content = new FileSystemComponent[oldContent.length];
                System.arraycopy(oldContent, 0, content, 0, i);
                System.arraycopy(oldContent, i + 1, content, i, oldContent.length - i - 1);

                size -= component.getSize();
                return;
            }
        }
        System.out.println("Файла " + component.getName() + " нет в " + getName());
    }

    public void display(String indent) {
        System.out.println(indent + getName());
        for (FileSystemComponent element : content) {
            if (element instanceof File) {
                System.out.println((indent.isEmpty() ? "  " : indent + indent) + element.getName());
            }
            else if (element instanceof Folder){
                ((Folder) element).display(Objects.equals(indent, "") ? indent + "  " : indent + indent);
            }
        }
    }
}
