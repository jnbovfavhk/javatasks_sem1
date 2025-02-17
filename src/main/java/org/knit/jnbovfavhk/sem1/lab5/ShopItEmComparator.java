package org.knit.jnbovfavhk.sem1.lab5;

import java.util.Comparator;

public class ShopItEmComparator implements Comparator<ShopItem> {
    @Override
    public int compare(ShopItem a, ShopItem b) {
        if (Double.compare(a.getPrice(), b.getPrice()) != 0) {
            return (Double.compare(a.getPrice(), b.getPrice()));
        } else {
            return a.getName().compareTo(b.getName());
        }
    }
}
