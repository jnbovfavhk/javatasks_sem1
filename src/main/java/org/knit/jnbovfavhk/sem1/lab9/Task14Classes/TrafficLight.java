package org.knit.jnbovfavhk.sem1.lab9.Task14Classes;

public enum TrafficLight {
    RED("GREEN"),
    GREEN("YELLOW"),
    YELLOW("RED");

    private final String nextLight;


    TrafficLight(String nextLight) {
        this.nextLight = nextLight;
    }

    public TrafficLight getNext() {
        return TrafficLight.valueOf(nextLight);
    }

}
