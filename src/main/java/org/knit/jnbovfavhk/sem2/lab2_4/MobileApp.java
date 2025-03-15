package org.knit.jnbovfavhk.sem2.lab2_4;

public class MobileApp implements StockObserver{

    @Override
    public void update(String companyName, double price) {
        System.out.println("Новое уведомление на телефоне. Акции компании " + companyName + " теперь стоят " +
                price + "$");
    }
}
