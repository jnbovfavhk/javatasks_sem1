package org.knit.jnbovfavhk.sem2.lab2_3;

import org.knit.jnbovfavhk.TaskDescription;
import org.knit.jnbovfavhk.sem2.lab2_2.Task2_8Classes.RandomStringGenerator;
import java.util.concurrent.CyclicBarrier;


@TaskDescription(number = 35, description = "Группа спортсменов участвует в забеге. " +
        "Однако перед началом гонки все должны собраться на старте. " +
        "Как только все участники будут готовы, забег начнётся одновременно. " +
        "Используйте CyclicBarrier, чтобы синхронизировать запуск гонки.\n" +
        "\n" +
        "Каждый бегун стартует одновременно, затем бежит разное время (симулируется Thread.sleep), " +
        "после чего финиширует. Как только все бегуны завершат дистанцию, " +
        "программа выводит сообщение о завершении гонки.")
public class Task2_10 {
    public static void execute() {

        int runnerCount = 5;
        CyclicBarrier barrier = new CyclicBarrier(runnerCount, new BarrierAction());

        for (int i = 0; i < runnerCount; i++) {
            new Thread(new Runner(RandomStringGenerator.getString(6), barrier)).start();
        }

    }
}
