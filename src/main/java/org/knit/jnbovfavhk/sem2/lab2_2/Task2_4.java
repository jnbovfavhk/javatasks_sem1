package org.knit.jnbovfavhk.sem2.lab2_2;

public class Task2_4 {
    public static void execute() {
        GasStation gasStation = new GasStation();

        for (int i = 0; i < 6; i++) {
            Car car = new Car(gasStation);
            car.start();
        }
    }
}


