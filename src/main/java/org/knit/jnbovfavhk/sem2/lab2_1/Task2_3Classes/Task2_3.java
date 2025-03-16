package org.knit.jnbovfavhk.sem2.lab2_1.Task2_3Classes;

import org.knit.jnbovfavhk.TaskDescription;

import java.util.Scanner;

@TaskDescription(number = 28, description = "Factory\n" +
        "Реализуйте фабрику по созданию различных видов транспортных средств в системе каршеринга.\n" +
        "\n" +
        "    Создайте интерфейс Transport с методом getSpecifications(), который возвращает характеристики транспортного средства.\n" +
        "    Создайте классы BusinessCar, FamilyVan и Motorbike, реализующие Transport.\n" +
        "        BusinessCar должен иметь комфортный салон и кожаные сиденья.\n" +
        "        FamilyVan должен поддерживать перевозку 6+ пассажиров.\n" +
        "        Motorbike предназначен для быстрой доставки.\n" +
        "    Создайте класс TransportFactory, который:\n" +
        "        Принимает параметр типа поездки (\"business\", \"family\", \"delivery\").\n" +
        "        Возвращает соответствующий объект (BusinessCar, FamilyVan, Motorbike).\n" +
        "    Добавьте обработку исключений, если передан неизвестный тип транспорта.\n" +
        "    Вызов TransportFactory.createTransport(\"business\") должен возвращать объект BusinessCar.\n", href = "org/knit/jnbovfavhk/sem2/lab2_1/Task2_3Classes")
public class Task2_3 {
    public static void execute() throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите тип поездки(business, long_family_journey, fast_delivery):");
        String travelType = scanner.next();
        Transport transport = TransportFactory.createTransport(travelType);
        System.out.println("Мы подобрали для вас средство передвижения! Взгляните:\n" + transport.getSpecifications());

    }
}
