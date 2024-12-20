package org.knit.jnbovfavhk.lab10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Task23 {
    public static void execute() throws FileNotFoundException {
        printType(345);
        printType(new FileOutputStream("resources/users_data_for_task13.ser"));
    }

    public static <T> void printType(T obj) {
        System.out.println(obj.getClass());
    }
}
