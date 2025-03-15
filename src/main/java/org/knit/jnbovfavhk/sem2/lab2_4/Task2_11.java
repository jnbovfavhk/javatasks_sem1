package org.knit.jnbovfavhk.sem2.lab2_4;

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
