package org.knit.jnbovfavhk.sem1.lab10;

import org.knit.jnbovfavhk.TaskDescription;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@TaskDescription(number = 23, description = "Напишите универсальный метод printType, который принимает объект " +
        "любого типа и выводит на экран имя его класса.")
public class Task23 {
    public static void execute() throws FileNotFoundException {
        printType(345);
        printType(new FileOutputStream("resources/users_data_for_task13.ser"));
    }

    public static <T> void printType(T obj) {
        System.out.println(obj.getClass());
    }
}
