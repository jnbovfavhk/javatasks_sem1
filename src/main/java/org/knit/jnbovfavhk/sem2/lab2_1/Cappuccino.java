package org.knit.jnbovfavhk.sem2.lab2_1;

public class Cappuccino implements Coffee{

    @Override
    public double getCost() {
        return 3;
    }

    @Override
    public String getDescription() {
        return "Двойной эспрессо, молоко, пенка";
    }
}
