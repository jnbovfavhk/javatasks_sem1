package org.knit.jnbovfavhk.sem2.lab2_4.Task2_12Classes;

import org.knit.jnbovfavhk.TaskDescription;

@TaskDescription(number = 37, description = "Паттерн Memento (Хранитель)\n" +
        "\n" +
        "Задача 12: Реализация системы отмены изменений в текстовом редакторе\n" +
        "\n" +
        "Разработайте систему, позволяющую сохранять состояния текста в редакторе и откатывать изменения назад.\n" +
        "\n" +
        "Требуется:\n" +
        "\n" +
        "    Создать класс TextEditor, который содержит текущий текст документа.\n" +
        "    Создать класс Memento, который будет хранить снимок состояния текста.\n" +
        "    Реализовать Caretaker, который управляет историей изменений (например, стек сохранённых состояний).\n" +
        "    Реализовать методы saveState() и undo() для сохранения и отката изменений.\n", href = "org/knit/jnbovfavhk/sem2/lab2_4/Task2_12Classes")
public class Task2_12 {
    public static void execute() {

        TextEditor textEditor = new TextEditor("Text.txt");
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


        TextEditor textEditor2 = new TextEditor("Text2.txt");
        UserService userService = new UserService(textEditor2);
        userService.startEditing();



    }
}
