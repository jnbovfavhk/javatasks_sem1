package org.knit.jnbovfavhk.sem1.lab2;

import org.knit.jnbovfavhk.TaskDescription;

import java.util.Scanner;

@TaskDescription(number = 3, description = "Класс консольного калькулятора")
public class Task3 {

    public static void execute() {
        System.out.println("Реализация консольного калькулятора");
        goCalculator();
    }
    public static void goCalculator() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите первое число(чтобы выйти напишите exit)");

            String input = scanner.nextLine();
            if (input.equals("exit")) {
                return;
            }
            double a = Double.parseDouble(input);

            System.out.println("Введите действие(+, -, *, /)");
            String operation = scanner.next();

            System.out.println("Введите второе число");
            double b = scanner.nextDouble();

            switch (operation) {
                case "+":
                    System.out.println("Ответ: " + Calculator.add(a, b));
                    goCalculator();
                    break;
                case "-":
                    System.out.println("Ответ: " + Calculator.substract(a, b));
                    goCalculator();
                    break;
                case "*":
                    System.out.println("Ответ: " + Calculator.multiply(a, b));
                    goCalculator();
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Не делите на ноль");
                    } else {
                        System.out.println("Ответ: " + Calculator.divide(a, b));
                    }
                    goCalculator();
                    break;
                default:
                    System.out.println("Такую операцию калькулятор не поддерживает, попробуйте другую");
                    goCalculator();
                    break;
            }
        }
    }
}
