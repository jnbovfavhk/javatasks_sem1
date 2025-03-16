package org.knit.jnbovfavhk.sem2.lab2_2.Task2_8Classes;

import org.knit.jnbovfavhk.TaskDescription;

import java.util.concurrent.*;

@TaskDescription(number = 33, description = "На перекрестке светофор управляет движением:\n" +
        "\n" +
        "    Красный свет – машины стоят (wait()).\n" +
        "    Зеленый свет – машины едут (notifyAll()).\n" +
        "    Светофор переключается каждые 5 секунд.\n" +
        "\n" +
        "Что нужно реализовать?\n" +
        "✔ Поток \"Светофор\" изменяет цвет и отправляет notifyAll().\n" +
        "✔ Потоки \"Машина\" ждут wait(), если красный свет.", href = "org/knit/jnbovfavhk/sem2/lab2_2/Task2_8Classes")
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
