package org.knit.jnbovfavhk.sem2.lab2_1.Task2_2Classes;

import org.knit.jnbovfavhk.TaskDescription;

@TaskDescription(number = 27, description = "Decorator\n" +
        "Реализуйте систему онлайн-заказов кофе.\n" +
        "\n" +
        "    У вас есть базовый класс Coffee, который имеет метод getCost() и getDescription().\n" +
        "    Напишите декораторы для добавления различных ингредиентов (молоко, карамель, шоколад).\n" +
        "    Каждый декоратор изменяет стоимость и описание кофе.\n" +
        "    Расширьте решение, добавив калорийность и разные виды напитков\n", href = "org/knit/jnbovfavhk/sem2/lab2_1/Task2_2Classes")
public class Task2_2 {
    public static void execute() {
        Coffee coffee1 = new Latte();
        Coffee coffee2 = new Cappuccino();

        System.out.printf("Напиток(%s) стоит $%s\n", coffee1.getDescription(), coffee1.getCost());
        System.out.printf("Напиток(%s) стоит $%s\n", coffee2.getDescription(), coffee2.getCost());

        coffee1 = new AlmondMilk(coffee1);
        coffee2 = new CoconutMilk(coffee2);
        coffee2 = new Sugar(coffee2);

        System.out.printf("Напиток(%s) стоит $%s\n", coffee1.getDescription(), coffee1.getCost());
        System.out.printf("Напиток(%s) стоит $%s\n", coffee2.getDescription(), coffee2.getCost());
    }
}
