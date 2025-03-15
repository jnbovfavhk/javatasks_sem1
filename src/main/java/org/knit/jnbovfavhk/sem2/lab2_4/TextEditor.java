package org.knit.jnbovfavhk.sem2.lab2_4;

import org.knit.jnbovfavhk.sem1.lab2.File;

import java.io.*;
import java.nio.file.Path;

public class TextEditor {
    private Path path;
    private String text;
    private String name;

    public TextEditor(String name, String text) {
        this.path = Path.of("C:\\Users\\belonozhkoin\\IdeaProjects\\javatasks\\src\\main\\java\\org\\knit\\jnbovfavhk\\sem2\\lab2_4" + name);
        this.text = text;
        this.name = name;
    }


    public void editText(String newText) {
        this.text = newText;
        save();
    }


    public Memento returnState() {
        return new Memento(name, text);
    }

    public String getName() {
        return name;
    }

    public void restore(Memento memento) {
        this.text = memento.getText();
        save();
    }

    public void save() {
        try (FileOutputStream file = new FileOutputStream(path.toString())) {
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
