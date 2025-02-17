package org.knit.jnbovfavhk.sem1.lab2;

public class Cube extends Shape{
    private final double volume;

    @Override
    protected double getVolume() {
        return volume;
    }

    public Cube(double size) {
        this.volume = Math.pow(size, 3);
    }
}
