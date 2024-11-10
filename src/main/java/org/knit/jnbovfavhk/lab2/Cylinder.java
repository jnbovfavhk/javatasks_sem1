package org.knit.jnbovfavhk.lab2;

public class Cylinder extends Shape{
    private final double volume;

    @Override
    protected double getVolume() {
        return volume;
    }

    public Cylinder(double r, double h) {
        this.volume = Math.PI * Math.pow(r, 2) * h;
    }
}
