package org.knit.jnbovfavhk.sem2.lab2_2;

public class GasStation {
    private int occupiedStation = 0;


    public synchronized void fillUp(Car car) throws InterruptedException {
        while (occupiedStation >= 2) {
            wait();
        }
        occupiedStation++;
        System.out.println(car.getName() + " заправляется... Занятых станций: " + occupiedStation);

        car.increaseFuel();
        Thread.sleep(500);

        occupiedStation--;
        notifyAll();

    }
}
