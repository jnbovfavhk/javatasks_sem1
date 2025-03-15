package org.knit.jnbovfavhk.sem2.lab2_4;

public class Task2_12 {
    public static void execute() {
        TextEditor textEditor = new TextEditor("Text.txt", "");

        CareTaker careTaker = new CareTaker(textEditor);
        careTaker.addSave();

        textEditor.editText("iouuthrogviu owihgg owiegh koqpo olhee");
        textEditor.editText("еще один текст");

        careTaker.addSave();
        textEditor.editText("jsdfug");
        careTaker.loadLastSave();
        careTaker.loadLastSave();
    }
}
