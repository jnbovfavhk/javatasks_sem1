package org.knit.jnbovfavhk.lab9;

import java.util.Scanner;

public class Task14 {
    public static void execute() {
        System.out.println("Введите текущий сигнал светофора (RED, YELLOW, GREEN): ");
        try (Scanner scanner = new Scanner(System.in)) {
            TrafficLight light = TrafficLight.valueOf(scanner.nextLine());
            System.out.println("Следующий сигнал: " + light.getNext());
        }


    }
}
