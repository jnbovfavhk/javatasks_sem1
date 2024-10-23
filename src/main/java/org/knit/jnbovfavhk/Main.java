package org.knit.jnbovfavhk;

import org.knit.jnbovfavhk.lab2.FileSystemComponent;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int[] a = new int[10];
        a[0] = 1;
        System.out.println(Arrays.stream(a).filter(x -> x != 0).toArray().length);
        org.knit.jnbovfavhk.lab2.Main.main();
    }
}
