package org.knit.jnbovfavhk.sem2.lab2_2;

import static java.lang.Thread.sleep;

public class Task2_7 {
    private int productCount = 0;
    private final int maxProducts = 5;

    public static void execute() {
        Task2_7 warehouse = new Task2_7();
        Consumer consumer = new Consumer(warehouse);
        Producer producer = new Producer(warehouse);

        consumer.start();
        producer.start();

    }

    public synchronized void produce() throws InterruptedException {
        while (productCount >= maxProducts) {
            wait();
        }

        productCount += 1;
        System.out.println("Произведен товар. Всего на складе: " + productCount);
        notifyAll();

    }

    public synchronized void consume() throws InterruptedException {
        while (productCount <= 0) {
            wait();
        }

        productCount -= 1;
        System.out.println("Один товар исчез. Всего на складе: " + productCount);
        notifyAll();

    }
}
