package org.knit.jnbovfavhk.sem2.lab2_4;

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
    }

    public Memento returnState() {
        return new Memento(name, text);
    }
}
