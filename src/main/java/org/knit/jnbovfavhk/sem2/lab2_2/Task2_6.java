package org.knit.jnbovfavhk.sem2.lab2_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Task2_6 {
    boolean trainIsGoing = false;

    public static void execute() {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Task2_6 task = new Task2_6();
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Train train = new Train();

        scheduler.scheduleAtFixedRate(() -> {
            try {
                task.goThroughRailway(train);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, 4, 4, TimeUnit.SECONDS);



        for (int i = 0; i < 8; i++) {
            Car car = new Car();
            executor.submit(() -> {
                try {
                    task.goThroughRailway(car);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        scheduler.schedule(scheduler::shutdown, 15, TimeUnit.SECONDS);

        executor.shutdown();



    }


    public synchronized void goThroughRailway(Machine machine) throws InterruptedException {
        if (trainIsGoing) {
            wait();
        }
        System.out.println(machine + " проезжает через железнодорожные пути");
        if (machine.getClass().equals(Train.class)){
            trainIsGoing = true;

            sleep(1000);

        }


        sleep(1000);
        trainIsGoing = false;
        notifyAll();
    }


}
