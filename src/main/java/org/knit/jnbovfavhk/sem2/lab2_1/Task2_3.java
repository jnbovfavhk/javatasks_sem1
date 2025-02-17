package org.knit.jnbovfavhk.sem2.lab2_1;

import java.util.Scanner;

public class Task2_3 {
    public static void execute() throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите тип поездки(business, long_family_journey, fast_delivery):");
        String travelType = scanner.next();
        Transport transport = TransportFactory.createTransport(travelType);
        System.out.println("Мы подобрали для вас средство передвижения! Взгляните:\n" + transport.getSpecifications());

    }
}
