package org.knit.jnbovfavhk.sem2.lab2_2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static java.lang.Thread.sleep;

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
