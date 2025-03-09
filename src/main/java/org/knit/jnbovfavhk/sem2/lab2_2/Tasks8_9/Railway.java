package org.knit.jnbovfavhk.sem2.lab2_2.Tasks8_9;

import org.knit.jnbovfavhk.sem1.lab9.TrafficLight;

import static java.lang.Thread.sleep;

public class Railway {
    private TrafficLight trafficLight;

    public Railway() {
        this.trafficLight = TrafficLight.RED;
    }

    public synchronized void setNextLight() {
        trafficLight = trafficLight.getNext();
        System.out.println("Свет светофора: " + trafficLight);
        notifyAll();
    }

    public TrafficLight getCurrentLight() {
        return trafficLight;
    }

    public synchronized void goThroughRailway(Car car) throws InterruptedException {
        if (getCurrentLight().equals(TrafficLight.GREEN)) {
            sleep(1000);
            System.out.println(car.getName() + " проехал(а) по шоссе");
        }
        else {
            wait();
        }
    }
}
