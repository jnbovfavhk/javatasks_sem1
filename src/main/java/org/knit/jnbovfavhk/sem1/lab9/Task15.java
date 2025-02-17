package org.knit.jnbovfavhk.sem1.lab9;

public class Task15 {
    public static void execute() {
        for (Seasons season : Seasons.values()) {
            System.out.printf("%s: %s, %s, %s\n", season, season.getSeasonName(), season.getWeather(), season.getHoliday());
        }
    }
}
