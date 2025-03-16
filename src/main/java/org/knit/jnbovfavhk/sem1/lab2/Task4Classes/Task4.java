package org.knit.jnbovfavhk.sem1.lab2.Task4Classes;

import org.knit.jnbovfavhk.TaskDescription;

@TaskDescription(number = 4, description = "Реализация классов для объемных фигур и контейнера", href = "org/knit/jnbovfavhk/sem1/lab2/Task4Classes")
public class Task4 {
    public static void execute() {
        System.out.println("Реализация классов для объемных фигур и контейнера");
        Container cont = new Container(1000);
        Shape cube = new Cube(5);
        cont.add(cube);
        System.out.println("Осталось " + cont.getLeftVolume());

        Shape sphere = new Sphere(3);
        cont.add(sphere);

        Shape cylinder = new Cylinder(5, 10);
        cont.add(cylinder);
        System.out.println("Цилиндр имеет объем " + cylinder.getVolume());
        System.out.println("Осталось " + cont.getLeftVolume());
    }

}
