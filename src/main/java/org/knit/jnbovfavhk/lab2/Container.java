package org.knit.jnbovfavhk.lab2;

public class Container {
    private double leftVolume;

    public Container(double leftVolume) {
        this.leftVolume = leftVolume;
    }

    public double getLeftVolume() {
        return leftVolume;
    }

    public void add(Shape shape) {
        if (leftVolume >= shape.getVolume()) {
            leftVolume -= shape.getVolume();
            System.out.println("Фигура добавлена");
        }
        else {
            System.out.println("В контейнере не хватает места");
        }
    }
}
