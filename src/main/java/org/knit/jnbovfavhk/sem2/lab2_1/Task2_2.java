package org.knit.jnbovfavhk.sem2.lab2_1;

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
