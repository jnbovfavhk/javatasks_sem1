package org.knit.jnbovfavhk.lab10;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Number> {
    private List<T> boxList;

    public double sum() {
        double sum = 0;
        for (T obj : boxList) {
//            sum += (double)obj;
            sum += obj.doubleValue();
        }
        return sum;
    }

    public void add(T item) {
        boxList.add(item);
    }

    public Box() {
        this.boxList = new ArrayList<>();
    }
}
