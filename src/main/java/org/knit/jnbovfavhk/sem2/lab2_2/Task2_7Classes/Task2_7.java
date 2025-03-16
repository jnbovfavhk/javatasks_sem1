package org.knit.jnbovfavhk.sem2.lab2_2.Task2_7Classes;

import org.knit.jnbovfavhk.TaskDescription;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@TaskDescription(number = 32, description = "Многопоточность\n" +
        "\n" +
        "    Производитель создает товары (максимум 5).\n" +
        "    Потребитель забирает товары.\n" +
        "    Если товаров нет, потребитель ждет (wait()).\n" +
        "    Если товаров максимум, производитель ждет (wait()).\n" +
        "\n" +
        "Что нужно реализовать?\n" +
        "✔ wait() – если товаров нет или склад заполнен.\n" +
        "✔ notify() – пробуждение потока, когда изменяется состояние склада.", href = "org/knit/jnbovfavhk/sem2/lab2_2/Task2_7Classes")
public class Task2_7 {
    private final BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);

    public static void execute() {
        Task2_7 task = new Task2_7();
        Consumer consumer = new Consumer(task.queue);
        Producer producer = new Producer(task.queue);

        producer.start();
        consumer.start();


    }




}
