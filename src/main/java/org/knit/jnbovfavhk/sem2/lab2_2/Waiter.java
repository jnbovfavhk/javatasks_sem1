package org.knit.jnbovfavhk.sem2.lab2_2;

public class Waiter extends Thread{
    private final Restaurant restaurant;

    public Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            try {
                restaurant.takeDish();
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
