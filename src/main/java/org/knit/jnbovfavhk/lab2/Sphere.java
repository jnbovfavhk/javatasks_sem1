package org.knit.jnbovfavhk.lab2;

public class Sphere extends Shape{
    private final double volume;


    @Override
    protected double getVolume() {
        return volume;
    }

    public Sphere(double size) {
        this.volume = ((double) 4 / 3) * Math.PI * Math.pow(size, 3);
    }
}
