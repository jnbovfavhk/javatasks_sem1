package org.knit.jnbovfavhk.sem2.lab2_4.Task2_11Classes;

import org.knit.jnbovfavhk.TaskDescription;

@TaskDescription(number = 36, description = "Паттерн Observer (Наблюдатель)\n" +
        "\n" +
        "Задача 11: Реализация системы уведомлений в биржевом приложении\n" +
        "\n" +
        "Вы разрабатываете приложение для биржевой торговли, где пользователи могут подписываться на обновления акций определённых компаний.\n" +
        "\n" +
        "Требуется:\n" +
        "\n" +
        "    Создать класс Stock (акция), который хранит информацию о текущей цене и может уведомлять подписчиков об изменении цены.\n" +
        "    Создать интерфейс StockObserver и реализовать его в классах MobileApp и EmailNotifier, которые получают уведомления при изменении цены.\n" +
        "    Реализовать механизм подписки и отписки для StockObserver.\n", href = "org/knit/jnbovfavhk/sem2/lab2_4/Task2_11Classes")
public class Task2_11 {
    public static void execute() {
        Stock teslaStock = new Stock("Tesla", 30.0);
        Stock googleStock = new Stock("Google", 12.37);

        StockObserver phone = new MobileApp();
        StockObserver email = new EmailNotifier();

        teslaStock.addObserver(phone);
        teslaStock.addObserver(email);

        googleStock.addObserver(phone);

        teslaStock.setCurrentPrice(33.59);
        googleStock.setCurrentPrice(100.23);
    }
}
