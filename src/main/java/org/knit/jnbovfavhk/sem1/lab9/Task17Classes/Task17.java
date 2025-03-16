package org.knit.jnbovfavhk.sem1.lab9.Task17Classes;

import org.knit.jnbovfavhk.TaskDescription;

@TaskDescription(number = 17, description = "Создайте аннотации для валидации значений полей в классе. " +
        "Реализуйте следующие аннотации:\n" +
        "\n" +
        "    @NotNull – Проверяет, чтобы значение поля не было null.\n" +
        "    @MaxLength(int value) – Проверяет, чтобы длина строки не превышала заданного значения.\n" +
        "    @Min(int value) – Проверяет, чтобы значение числа не было меньше заданного значения.\n" +
        "\n" +
        "Также реализуйте механизм проверки (валидатор), который:\n" +
        "\n" +
        "    Читает аннотации из полей класса.\n" +
        "    Проверяет, удовлетворяют ли значения полей указанным условиям.\n" +
        "    Выводит ошибки, если условия не выполнены.\n", href = "org/knit/jnbovfavhk/sem1/lab9/Task17Classes")
public class Task17 {
    public static void execute() throws IllegalAccessException {
        User user = new User(null, "sdiyghjerhgsdfuhgisluc", -5);
        Validator.validate(user);
    }
}
