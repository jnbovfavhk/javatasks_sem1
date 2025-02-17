package org.knit.jnbovfavhk.sem2.lab2_1;

public class Latte implements Coffee {

    @Override
    public double getCost() {
        return 2.5;
    }

    @Override
    public String getDescription() {
        return "Эспрессо, молоко, пенка";
    }
}
