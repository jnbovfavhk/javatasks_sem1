package org.knit.jnbovfavhk.sem2.lab2_2;

public class Task2_5 {
    public static void execute() {
        Restaurant rest = new Restaurant();

        Cook cook = new Cook(rest);
        Waiter waiter = new Waiter(rest);

        cook.start();
        waiter.start();
    }
}
