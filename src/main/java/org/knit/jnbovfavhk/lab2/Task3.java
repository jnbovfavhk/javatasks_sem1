package org.knit.jnbovfavhk.lab2;

import java.util.Scanner;

public class Task3 {

    public void execute() {
        System.out.println("Реализация консольного калькулятора");
        goCalculator();
    }
    public void goCalculator() {
        System.out.println("Введите первое число(чтобы выйти напишите exit)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
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
                }
                else {
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
