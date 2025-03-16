package org.knit.jnbovfavhk.sem2.lab2_4.Task2_13Classes;

import org.knit.jnbovfavhk.TaskDescription;

@TaskDescription(number = 38, description = "Паттерн Command (Команда)\n" +
        "\n" +
        "Задача 13: Реализация системы команд для управления умным домом\n" +
        "\n" +
        "Вы разрабатываете систему управления \"умным домом\", где пользователь может выполнять различные команды, такие как включение/выключение света, управление телевизором и кондиционером.\n" +
        "\n" +
        "Требуется:\n" +
        "\n" +
        "    Создать интерфейс Command, который определяет метод execute().\n" +
        "    Реализовать классы команд:\n" +
        "        LightOnCommand – включает свет.\n" +
        "        LightOffCommand – выключает свет.\n" +
        "        TVOnCommand – включает телевизор.\n" +
        "        TVOffCommand – выключает телевизор.\n" +
        "    Создать класс RemoteControl, который хранит команду и позволяет её выполнить.\n" +
        "    Реализовать механизм отмены последней команды (undo).\n", href = "org/knit/jnbovfavhk/sem2/lab2_4/Task2_13Classes")
public class Task2_13 {
    public static void execute() {
        SmartHouse house = new SmartHouse();
        RemoteControl remoteControl = new RemoteControl();

        LightOffCommand lightOff = new LightOffCommand(house);
        LightOnCommand lightOn = new LightOnCommand(house);
        TVOffCommand tvOff = new TVOffCommand(house);
        TVOnCommand tvOn = new TVOnCommand(house);

        remoteControl.executeCommand(lightOn);
        remoteControl.executeCommand(tvOn);
        remoteControl.executeCommand(lightOff);

        System.out.println("========");
        remoteControl.undoLastCommand();
        remoteControl.undoLastCommand();
        remoteControl.undoLastCommand();
        remoteControl.undoLastCommand();
    }
}
