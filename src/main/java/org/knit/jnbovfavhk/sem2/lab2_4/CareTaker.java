package org.knit.jnbovfavhk.sem2.lab2_4;

import java.util.Stack;

public class CareTaker {
    private final TextEditor relatedEditor;
    private final Stack<Memento> history = new Stack();

    public void addSave() {
        history.push(relatedEditor.returnState());
        System.out.println("Файл " + relatedEditor.getName() + " сохранен");
    }

    public void loadLastSave() {
        if (history.isEmpty()) {
            System.out.println("Нет созраненных изменений");
        }

        relatedEditor.restore(history.pop());
        System.out.println("Восстановлена предыдущая версия файла");

    }

    public CareTaker(TextEditor relatedEditor) {
        this.relatedEditor = relatedEditor;
    }
}
