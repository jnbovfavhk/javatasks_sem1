package org.knit.jnbovfavhk.sem1.lab10.Task20Classes;

import org.knit.jnbovfavhk.TaskDescription;

@TaskDescription(number = 20, description = "Создайте класс Box с ограничением типа T extends Number. " +
        "Реализуйте метод для вычисления суммы всех чисел, хранящихся в контейнере.", href = "org/knit/jnbovfavhk/sem1/lab10/Task20Classes")
public class Task20 {
    public static void execute() {
        Box<Integer> integerBox = new Box<>();
        integerBox.add(10);
        integerBox.add(20);
        integerBox.add(30);
        System.out.println("Integer Box: " + integerBox.sum());

        Box<Float> floatBox = new Box<>();
        floatBox.add(5.5f);
        floatBox.add(4.5f);
        System.out.println("Float Box: " + floatBox.sum());
    }
}
