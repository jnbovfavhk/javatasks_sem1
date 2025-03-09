package org.knit.jnbovfavhk.sem2.lab2_2;

import java.util.concurrent.BlockingQueue;


class Producer extends Thread {
    private final BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < 10; i++) {
                produce();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void produce() throws InterruptedException {

        queue.put(1); // Ждет, если очередь заполнена
        System.out.println("Произведен товар. Всего на складе: " + queue.size());
        Thread.sleep(700);

    }
}