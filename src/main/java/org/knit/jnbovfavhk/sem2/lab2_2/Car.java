package org.knit.jnbovfavhk.sem2.lab2_2;

public class Car extends Thread implements Machine{

    private int fuel;
    private final GasStation gasStation;

    public Car(GasStation gasStation) {
        this.gasStation = gasStation;
    }

    @Override
    public void run() {
        try {
            gasStation.fillUp(this);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void increaseFuel() {
        if (fuel < 50) {
            fuel += 20;
        }
        if (fuel > 50) {
            fuel = 50;
        }
    }


    public Car() {
        gasStation = null;
    }
}
