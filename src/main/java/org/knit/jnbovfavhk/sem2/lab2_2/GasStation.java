package org.knit.jnbovfavhk.sem2.lab2_2;

import static java.lang.Thread.sleep;

public class GasStation {
    private volatile int occupiedStation = 0;


    public synchronized void fillUp(Car car) throws InterruptedException {
        while (occupiedStation > 1) {
            System.out.println("occ "+ occupiedStation);
            wait();
        }
        occupiedStation++;
        System.out.println(car.getName() + " заправляется... Занятых станций: " + occupiedStation);

        car.increaseFuel();
        sleep(1000);

        occupiedStation--;
        notifyAll();

    }
}
