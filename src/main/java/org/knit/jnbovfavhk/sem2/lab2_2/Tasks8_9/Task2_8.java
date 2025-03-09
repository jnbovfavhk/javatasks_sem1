package org.knit.jnbovfavhk.sem2.lab2_2.Tasks8_9;

import org.knit.jnbovfavhk.sem1.lab9.TrafficLight;

import java.util.concurrent.*;

public class Task2_8 {

    public static void execute() throws InterruptedException {
        Railway railway = new Railway();

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        ExecutorService executor = Executors.newFixedThreadPool(1);


        for (int i = 0; i < 7; i++) {
            executor.submit(() -> {
                try {
                    railway.goThroughRailway(new Car(RandomStringGenerator.getString(7)));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        scheduler.scheduleAtFixedRate(railway::setNextLight, 3, 3, TimeUnit.SECONDS);

        scheduler.schedule(scheduler::shutdown, 20, TimeUnit.SECONDS);
        executor.shutdown();

    }

}
