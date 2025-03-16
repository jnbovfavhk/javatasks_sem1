package org.knit.jnbovfavhk.sem2.lab2_4;

import java.util.Scanner;
import java.util.Stack;

public class CareTaker {
    private final TextEditor relatedEditor;
    private final Stack<Memento> history = new Stack<>();

    public void addSave() {
        history.push(relatedEditor.returnState());
        System.out.println("Файл " + relatedEditor.getName() + " сохранен");
    }

    public void loadLastSave() {
        if (history.isEmpty()) {
            System.out.println("Нет сохраненных изменений");
        }
        else {
            relatedEditor.restore(history.pop());
            System.out.println("Восстановлена предыдущая версия файла");
        }

    }

    public CareTaker(TextEditor relatedEditor) {
        this.relatedEditor = relatedEditor;
    }

    public void startEditing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вам предоставлен файл src/main/java/org/knit/jnbovfavhk/sem2/lab2_4/" + relatedEditor.getName());

        while (true) {
            System.out.println("Что вы хотите сделать?\n" +
                    "1. Записать что-то в файл\n" +
                    "2. Сохранить\n" +
                    "3. Вернуться к последней сохраненной версии файла\n" +
                    "4. Посмотреть содержимое\n" +
                    "5. Выйти");
            String ans = scanner.nextLine();
            switch (ans) {
                case "1":
                    System.out.println("Что пишем:");

                    String text = scanner.nextLine();
                    relatedEditor.editText(text);
                    System.out.println();
                    break;

                case "2":
                    addSave();
                    System.out.println();
                    break;

                case "3":
                    this.loadLastSave();
                    System.out.println();
                    break;

                case "4":
                    System.out.println(relatedEditor.getText());
                    System.out.println();
                    break;

                case "5":
                    return;

                default:
                    System.out.println("Вы ввели что-то некорректное");
                    break;
            }
        }
    }
}
