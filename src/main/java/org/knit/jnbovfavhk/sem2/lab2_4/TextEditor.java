package org.knit.jnbovfavhk.sem2.lab2_4;

import org.knit.jnbovfavhk.sem1.lab2.File;

import java.io.*;
import java.nio.file.Path;

public class TextEditor {
    private final Path path;
    private String text;
    private final String name;

    public TextEditor(String name, String text) {

        this.path = Path.of("src/main/java/org/knit/jnbovfavhk/sem2/lab2_4/" + name);
//        для сгу
//        this.path = Path.of("C:\\Users\\belonozhkoin\\IdeaProjects\\javatasks\\src\\main\\java\\org\\knit\\jnbovfavhk\\sem2\\lab2_4\\" + name);
        this.text = text;
        this.name = name;
    }


    public void editText(String newText) {
        this.text = newText;
        saveToFile();
    }


    public Memento returnState() {
        return new Memento(name, text);
    }

    public String getName() {
        return name;
    }

    public void restore(Memento memento) {
        this.text = memento.getText();
        saveToFile();
    }

    private void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toString()))) {

            writer.write(text);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public String getText() {
        return text;
    }
}
