package org.knit.jnbovfavhk.sem2.lab2_4;

public class EmailNotifier implements StockObserver{
    @Override
    public void update(String companyName, double price) {
        System.out.println("На email поступило сообщение! Акции компании " + companyName + " теперь стоят " +
                price + "$");
    }
}
