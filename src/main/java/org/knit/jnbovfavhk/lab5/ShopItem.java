package org.knit.jnbovfavhk.lab5;

import java.util.Random;

public class ShopItem implements Comparable<ShopItem>{
    private final String name;
    public final Integer price;
    private final String country;

    public ShopItem(String name) {
        this.name = name;
        Random random = new Random();
        price = random.nextInt(3) + 5;
        String[] countries = new String[]{"Russia", "USA", "China"};
        country = countries[random.nextInt(3)];
    }

    @Override
    public int compareTo(ShopItem o) {
        return new ShopItEmComparator().compare(this, o);
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s (цена - %s; страна - %s)", name, price, country);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Проверка на сравнение самого объекта с собой
        if (obj == null || getClass() != obj.getClass()) return false;  // Проверка на null и тип объекта
        ShopItem shopItem = (ShopItem) obj;  // Приведение типа
        return price == shopItem.getPrice() && name.equals(shopItem.getName());  // Сравнение полей
    }
}
