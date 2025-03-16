package org.knit.jnbovfavhk.sem1.lab9.Task14Classes;

import org.knit.jnbovfavhk.TaskDescription;

import java.util.Scanner;

@TaskDescription(number = 14, description = "Создайте Enum TrafficLight с состояниями светофора: RED, YELLOW, GREEN." +
        " Добавьте метод getNextLight(), который возвращает следующее состояние светофора.\n" +
        "\n" +
        "Напишите программу, которая:\n" +
        "\n" +
        "    Запрашивает текущий сигнал светофора.\n" +
        "    Выводит следующий сигнал.\n", href = "org/knit/jnbovfavhk/sem1/lab9/Task14Classes")
public class Task14 {
    public static void execute() {
        System.out.println("Введите текущий сигнал светофора (RED, YELLOW, GREEN): ");
        try (Scanner scanner = new Scanner(System.in)) {
            TrafficLight light = TrafficLight.valueOf(scanner.nextLine());
            System.out.println("Следующий сигнал: " + light.getNext());
        }


    }
}
