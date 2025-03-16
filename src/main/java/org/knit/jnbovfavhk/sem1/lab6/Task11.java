package org.knit.jnbovfavhk.sem1.lab6;

import org.knit.jnbovfavhk.TaskDescription;

import java.util.Scanner;
import java.util.TreeSet;

@TaskDescription(number = 1, description = "Создание программы на Java, которая управляет списком студентов с " +
        "использованием коллекции TreeSet. Программа должна поддерживать функции добавления, удаления, вывода на экран, " +
        "поиска по имени")
public class Task11 {
    public static void execute() {
        TreeSet<String> setOfStudents = new TreeSet<String>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Меню:\n" +
                    "1. Добавить студента\n" +
                    "2. Удалить студента\n" +
                    "3. Показать всех студентов\n" +
                    "4. Найти студента по имени\n" +
                    "5. Выйти из программы");
            switch (scanner.next()) {
                case "1":
                    System.out.print("Введите имя студента:");
                    String newStudent = scanner.next();
                    setOfStudents.add(newStudent);
                    break;

                case "2":
                    System.out.print("Введите имя студента:");
                    String studentToDelete = scanner.next();
                    if (setOfStudents.contains(studentToDelete)) {
                        setOfStudents.remove(studentToDelete);
                    } else {
                        System.out.println("Такого студента нет");
                    }
                    break;

                case "3":
                    setOfStudents.forEach(student -> System.out.println(student));
                    break;

                case "4":
                    System.out.print("Введите имя студента для поиска:");
                    String student = scanner.next();
                    if (setOfStudents.contains(student)) {
                        System.out.println("Такой студент есть");
                    } else {
                        System.out.println("Такого студента нет");
                    }
                    break;

                case "5":
                    return;
                default:
                    System.out.println("Введите цифру, соответствующую действию");
            }
        }
    }
}
