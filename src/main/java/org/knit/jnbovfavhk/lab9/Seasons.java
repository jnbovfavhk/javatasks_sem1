package org.knit.jnbovfavhk.lab9;

enum Seasons {
    WINTER("Зима", "Холодно", "Новый год"),
    SPRING("Весна", "Тепло", "8 марта"),
    SUMMER("Лето", "Жарко", "Сабантуй"),
    AUTUMN("Осень", "Тепло", "Хэллоуин");

    private final String seasonName;
    private final String weather;
    private final String holiday;

    Seasons(String seasonName, String weather, String holiday) {
        this.seasonName = seasonName;
        this.weather = weather;
        this.holiday = holiday;
    }

    public String getHoliday() {
        return holiday;
    }

    public String getWeather() {
        return weather;
    }

    public String getSeasonName() {
        return seasonName;
    }
}
