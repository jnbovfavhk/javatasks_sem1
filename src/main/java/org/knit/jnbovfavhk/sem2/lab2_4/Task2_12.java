package org.knit.jnbovfavhk.sem2.lab2_4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task2_12 {
    public static void execute() {

        TextEditor textEditor = new TextEditor("Text.txt", "");
        CareTaker careTaker = new CareTaker(textEditor);

        careTaker.addSave();

        textEditor.editText("iouuthrogviu owihgg owiegh koqpo olhee");
        careTaker.addSave();
        textEditor.editText("еще один текст");
        careTaker.addSave();
        textEditor.editText("jsdfug");
        careTaker.addSave();
        textEditor.editText("erfiuherfiouhwerfwerfwerfwergwrgdfsgsdgwregf");
        careTaker.addSave();
        textEditor.editText("последний");
        careTaker.loadLastSave();
        careTaker.loadLastSave();
        careTaker.loadLastSave();


        TextEditor textEditor2 = new TextEditor("Text2.txt", "");
        CareTaker careTaker2 = new CareTaker(textEditor2);
        careTaker2.startEditing();



    }
}
