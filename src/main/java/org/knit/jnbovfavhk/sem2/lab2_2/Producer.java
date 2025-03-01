package org.knit.jnbovfavhk.sem2.lab2_2;

import static java.lang.Thread.sleep;

public class Producer extends Thread{
    // склад товаров
    private final Task2_7 warehouse;

    public Producer(Task2_7 warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 7; i++) {
                warehouse.produce();
                sleep(200);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
