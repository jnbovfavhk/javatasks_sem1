package org.knit.jnbovfavhk.sem2.lab2_2.Tasks2_9Classes;

import org.knit.jnbovfavhk.TaskDescription;

@TaskDescription(number = 34, description = "На заводе работают три типа рабочих, каждый из которых выполняет свою часть работы в конвейерном режиме:\n" +
        "\n" +
        "    Штамповщик – вырезает заготовку (создает объект детали).\n" +
        "    Сборщик – собирает из заготовки готовую деталь.\n" +
        "    Оператор контроля качества – проверяет деталь и отправляет на склад.\n" +
        "\n" +
        "Каждый рабочий – отдельный поток, и они должны работать последовательно, используя общую очередь для передачи деталей.\n" +
        "Требования к решению\n" +
        "\n" +
        "    Использовать потоки (Thread или ExecutorService).\n" +
        "    Использовать синхронизацию (wait(), notify(), BlockingQueue).\n" +
        "    Реализовать конвейерную передачу данных между потоками.\n", href = "org/knit/jnbovfavhk/sem2/lab2_2/Tasks2_9Classes")
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
