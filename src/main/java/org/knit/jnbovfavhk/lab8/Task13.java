package org.knit.jnbovfavhk.lab8;

import javax.sound.sampled.AudioFormat;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task13 {
    public static void execute() {
        List<User> listOfUsers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие:\n" +
                    "1. Добавить нового пользователя\n" +
                    "2. Показать всех пользователей\n" +
                    "3. Сохранить список пользователей в файл\n" +
                    "4. Загрузить список пользователей из файла\n" +
                    "5. Выйти");
            switch (scanner.next()) {
                case "1":
                    System.out.println("Введите имя пользователя:");
                    String name = scanner.next();
                    System.out.println("Введите возраст:");
                    String age = scanner.next();
                    System.out.println("Введите email");
                    String email = scanner.next();
                    try {
                        listOfUsers.add(new User(name, Integer.parseInt(age), email));
                        System.out.println("Пользователь добавлен");
                    } catch (NumberFormatException e) {
                        System.out.println("Что-то пошло не так");
                    }
                    break;

                case "2":
                    for (User user : listOfUsers) {
                        System.out.println(user.getInfo());
                    }
                    break;

                case "3":
                    try (ObjectOutputStream outputFile = new ObjectOutputStream(new FileOutputStream("resources/users_data_for_task13.ser"))) {
                        for (User user : listOfUsers) {
                            System.out.println(user);
                        }
                        outputFile.writeObject(listOfUsers);

                        System.out.println("Успешно записано");
                        break;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                case "4":
                    try (ObjectInputStream inputFile = new ObjectInputStream(new FileInputStream("resources/users_data_for_task13.ser"))) {
                        System.out.println("Вы уверены? текущий список пользователей исчезнет(+/-)");
                        String answer = scanner.next();
                        if (answer.equals("-")) {
                            break;
                        } else if (!answer.equals("+")) {
                            System.out.println("Команда непонятна");
                        }

                        listOfUsers.clear();
                        listOfUsers = (List<User>) inputFile.readObject();
                        System.out.println("Успешно считано");
                        break;
                    } catch (IOException | ClassNotFoundException e) {
                        System.out.println("В файле ничего нет");
                        break;
                    }

                case "5":
                    System.out.println("Вы уверены? текущий список пользователей исчезнет(+/-)");
                    String answer = scanner.next();
                    if (answer.equals("-")) {
                        break;
                    } else if (!answer.equals("+")) {
                        System.out.println("Команда непонятна");
                        break;
                    }

                    return;
            }
        }
    }
}
