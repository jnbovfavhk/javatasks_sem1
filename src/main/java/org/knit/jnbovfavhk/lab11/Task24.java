package org.knit.jnbovfavhk.lab11;

import java.sql.SQLException;
import java.util.Scanner;

public class Task24 {
    public static void execute() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие(напишите цифру):" +
                    "\n1. Добавить пользователя" +
                    "\n2. Посмотреть всех пользователей" +
                    "\n3. Удалить пользователя" +
                    "\n4. Обновить информацию о пользователе" +
                    "\n5. Выйти");


            switch (scanner.next()) {
                case "1":
                    System.out.print("Введите имя:");
                    String name = scanner.next();
                    System.out.print("\nВведите адрес электронной почты:");
                    String email = scanner.next();

                    UserService.registerUser(name, email);
                    break;

                case "2":
                    UserService.listAllUsers();
                    break;

                case "3":
                    System.out.print("Введите электронную почту того, кого хотите удалить:");
                    String emailToDelete = scanner.next();
                    UserService.deleteUser(emailToDelete);
                    break;

                case "4":
                    System.out.print("Введите email:");
                    String emailToUpdate = scanner.next();
                    System.out.print("\nВведите имя:");
                    String nameToUpdate = scanner.next();
                    UserService.updateUser(nameToUpdate, emailToUpdate);
                    break;

                case "5":
                    return;
            }
        }
    }
}
