package org.knit.jnbovfavhk.sem1.lab2.Task4Classes;

public class Cylinder extends Shape {
    private final double volume;

    @Override
    protected double getVolume() {
        return volume;
    }

    public Cylinder(double r, double h) {
        this.volume = Math.PI * Math.pow(r, 2) * h;
    }
}
