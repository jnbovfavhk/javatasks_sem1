package org.knit.jnbovfavhk.sem2.lab2_2.Tasks8_9;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Task2_9 {
    public static void execute() {
        Factory factory = new Factory();
        QualityControl qualityControl = new QualityControl(factory);
        Collector collector = new Collector(factory);
        Stamper stamper = new Stamper(factory);

        Thread thread1 = new Thread(stamper);
        Thread thread2 = new Thread(collector);
        Thread thread3 = new Thread(qualityControl);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
