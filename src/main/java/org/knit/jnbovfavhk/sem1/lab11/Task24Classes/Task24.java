package org.knit.jnbovfavhk.sem1.lab11.Task24Classes;

import org.knit.jnbovfavhk.TaskDescription;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

@TaskDescription(number = 24, description = "Реализовать консольное приложение, которое:\n" +
        "\n" +
        "    Позволяет пользователю вводить команды для добавления, удаления, просмотра и обновления пользователей.\n" +
        "    Использует паттерн DAO для работы с базой данных.\n" +
        "    Реализует бизнес-логику в классе UserService.\n", href = "org/knit/jnbovfavhk/sem1/lab11/Task24Classes")
public class Task24 {
    public static void execute() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService(new UserDAOTree());
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

                    userService.registerUser(name, email);
                    break;

                case "2":
                    List<User> users = userService.listAllUsers();
                    for (User user : users) {
                        System.out.println(user);
                    }
                    break;

                case "3":
                    System.out.print("Введите электронную почту того, кого хотите удалить:");
                    String emailToDelete = scanner.next();
                    userService.deleteUser(emailToDelete);
                    break;

                case "4":
                    System.out.print("Введите email:");
                    String emailToUpdate = scanner.next();
                    System.out.print("\nВведите имя:");
                    String nameToUpdate = scanner.next();
                    userService.updateUser(nameToUpdate, emailToUpdate);
                    break;

                case "5":
                    return;
            }
        }
    }
}
