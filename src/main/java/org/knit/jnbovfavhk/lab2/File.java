package org.knit.jnbovfavhk.lab2;

public class File extends FileSystemComponent{

//    public File(int size, String name) {
//        super(size, name);
//    }


    public File(String name, int size) {
        super(name, size);
    }

    @Override
    void add(FileSystemComponent component) {
        System.out.println("Данный метод неприменим к файлу");
    }

    @Override
    void display(String indent) {
        System.out.println("Данный метод неприменим к файлу");
    }

    @Override
    void remove(FileSystemComponent component) {
        System.out.println("Данный метод неприменим к файлу");
    }

}
