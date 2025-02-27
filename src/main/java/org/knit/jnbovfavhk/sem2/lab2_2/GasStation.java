package org.knit.jnbovfavhk.sem2.lab2_2;

public class GasStation {
    private int occupiedStation = 0;


    public synchronized void fillUp(Car car) throws InterruptedException {
        while (occupiedStation >= 3) {
            wait();
        }
        occupiedStation++;
        System.out.println(car.getName() + " заправляется... Занятых станций: " + occupiedStation);

        car.increaseFuel();
        Thread.sleep(1000);

        occupiedStation--;
        notifyAll();

    }
}
