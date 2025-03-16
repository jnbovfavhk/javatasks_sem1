package org.knit.jnbovfavhk.sem1.lab2.Task4Classes;

public class Sphere extends Shape {
    private final double volume;


    @Override
    protected double getVolume() {
        return volume;
    }

    public Sphere(double size) {
        this.volume = ((double) 4 / 3) * Math.PI * Math.pow(size, 3);
    }
}
