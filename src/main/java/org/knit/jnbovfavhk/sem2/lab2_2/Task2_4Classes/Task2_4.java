package org.knit.jnbovfavhk.sem2.lab2_2.Task2_4Classes;

import org.knit.jnbovfavhk.TaskDescription;

@TaskDescription(number = 29, description = "Многопоточность.\n" +
        "На автозаправочной станции только 2 колонки. Если все заняты, машины ждут в очереди.\n" +
        "Когда колонка освобождается, следующий автомобиль из очереди начинает заправку.\n" +
        "\n" +
        "Что нужно реализовать?\n" +
        "✔ Использовать wait() и notify() для ожидания и освобождения заправки.\n" +
        "✔ Поток \"Машина\" ждет, если все колонки заняты.\n" +
        "✔ Поток \"Машина\" заправляется, затем освобождает колонку.", href = "org/knit/jnbovfavhk/sem2/lab2_2/Task2_4Classes")
public class Task2_4 {
    public static void execute() {
        GasStation gasStation = new GasStation();

        for (int i = 0; i < 6; i++) {
            Car car = new Car(gasStation);
            car.start();
        }
    }
}


