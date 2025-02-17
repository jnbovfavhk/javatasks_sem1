package org.knit.jnbovfavhk.sem1.lab2;

public abstract class FileSystemComponent {
    protected String name;
    protected int size;

    public FileSystemComponent(String name, int size) {
        this.size = size;
        this.name = name;
    }

    public FileSystemComponent(String name) {
        this.name = name;
    }

    abstract void add(FileSystemComponent component);


    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    abstract void display(String indent);

    abstract void remove(FileSystemComponent component);
}
