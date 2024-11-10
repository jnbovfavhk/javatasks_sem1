package org.knit.jnbovfavhk.lab2;

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
