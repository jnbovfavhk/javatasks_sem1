package org.knit.jnbovfavhk.sem2.lab2_2.Task2_5Classes;

import org.knit.jnbovfavhk.TaskDescription;

@TaskDescription(number = 30, description = "многопоточность. \n" +
        "В ресторане работает один повар и один официант.\n" +
        "\n" +
        "    Повар готовит блюда и ставит их на поднос (максимум 3 блюда).\n" +
        "    Официант берет готовые блюда и подает их клиентам.\n" +
        "\n" +
        "Что нужно реализовать?\n" +
        "✔ Повар не может готовить больше 3 блюд (ждет wait()).\n" +
        "✔ Официант ждет, если поднос пуст (wait()).\n" +
        "✔ При каждой передаче блюда используется notify().", href = "org/knit/jnbovfavhk/sem2/lab2_2/Task2_5Classes")
public class Task2_5 {
    public static void execute() {
        Restaurant rest = new Restaurant();

        Cook cook = new Cook(rest);
        Waiter waiter = new Waiter(rest);

        cook.start();
        waiter.start();
    }
}
