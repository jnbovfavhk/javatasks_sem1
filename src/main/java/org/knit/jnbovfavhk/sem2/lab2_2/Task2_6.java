package org.knit.jnbovfavhk.sem2.lab2_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Task2_6 {
    boolean trainIsGoing = false;

    public static void execute() {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Task2_6 task = new Task2_6();
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Train train = new Train();
        scheduler.schedule(() -> {
            try {
                task.goThroughRailway(train);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, 3, TimeUnit.SECONDS);



        for (int i = 0; i < 5; i++) {
            Car car = new Car();
            executor.submit(() -> {
                try {
                    task.goThroughRailway(car);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        scheduler.shutdown();
        executor.shutdown();


    }


    public synchronized void goThroughRailway(Machine machine) throws InterruptedException {
        if (trainIsGoing) {
            wait();
        }
        if (machine.getClass().equals(Train.class)){
            trainIsGoing = true;
        }

        System.out.println(machine + " проезжает через железнодорожные пути");
        sleep(2000);
        trainIsGoing = false;
        notifyAll();
    }
}
