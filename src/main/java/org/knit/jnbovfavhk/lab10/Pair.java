package org.knit.jnbovfavhk.lab10;

public class Pair <T, T2>{
    private T value1;
    private T2 value2;

    public T2 getValue2() {
        return value2;
    }

    public T getValue1() {
        return value1;
    }

    public Pair(T value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}
