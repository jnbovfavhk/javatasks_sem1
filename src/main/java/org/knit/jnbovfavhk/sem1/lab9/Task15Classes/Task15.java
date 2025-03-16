package org.knit.jnbovfavhk.sem1.lab9.Task15Classes;

import org.knit.jnbovfavhk.TaskDescription;
import org.knit.jnbovfavhk.sem1.lab9.Task15Classes.Seasons;

@TaskDescription(number = 15, description = "Создайте Enum для времён года (Season). Для каждого времени года укажите:\n" +
        "\n" +
        "    Температуру (в виде строки, например, \"Холодно\", \"Тепло\").\n" +
        "    Типичный праздник (например, \"Новый год\" для Winter).\n" +
        "\n" +
        "Напишите программу, которая выводит информацию о каждом времени года, используя метод values().", href = "org/knit/jnbovfavhk/sem1/lab9/Task15Classes")
public class Task15 {
    public static void execute() {
        for (Seasons season : Seasons.values()) {
            System.out.printf("%s: %s, %s, %s\n", season, season.getSeasonName(), season.getWeather(), season.getHoliday());
        }
    }
}
