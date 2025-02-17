package org.knit.jnbovfavhk.sem1.lab5;



import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Task8 {

    public static void execute() {
        String[] names = {"книга", "ручка", "линейка", "пенал", "тетрадь", "карандаш"};
        Random random = new Random();
        ShopItem[] items = new ShopItem[100];
        for (int i = 0; i <= 99; i++) {
            ShopItem item = new ShopItem(names[random.nextInt(6)]);
            System.out.println(item);
            items[i] = item;
        }
        Arrays.sort(items, Comparator.comparing(ShopItem::getName)
                .thenComparing(ShopItem::getPrice));
        int k = 1;
        int mk = 0;
        for (int j = 0; j < 99; j++) {
            if (items[j].equals(items[j + 1])) {
                k++;
                mk = Integer.max(mk, k);
            }
            else {
                k = 1;
            }
        }

        System.out.printf("Максимальное количество одинаковых элементов - %s", mk);
        System.out.println(Arrays.toString(items));
    }
}
