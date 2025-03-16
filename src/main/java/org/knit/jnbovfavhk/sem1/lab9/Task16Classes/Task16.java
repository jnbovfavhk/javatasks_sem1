package org.knit.jnbovfavhk.sem1.lab9.Task16Classes;

import org.knit.jnbovfavhk.TaskDescription;

@TaskDescription(number = 16, description = "Создайте два Enum:\n" +
        "\n" +
        "    Suit для мастей карт (Пики, Черви, Бубны, Трефы).\n" +
        "    Rank для значений карт (2-10, Валет, Дама, Король, Туз).\n" +
        "\n" +
        "Напишите программу, которая генерирует стандартную 52-карточную колоду, используя комбинации мастей и значений," +
        " и выводит её.", href = "org/knit/jnbovfavhk/sem1/lab9/Task16Classes")
public class Task16 {
    public static void execute() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                System.out.println(rank.getRankName() + " " + suit.getSuitName());
            }
        }
    }
}
