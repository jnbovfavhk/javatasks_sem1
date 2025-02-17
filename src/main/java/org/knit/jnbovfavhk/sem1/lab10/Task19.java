package org.knit.jnbovfavhk.sem1.lab10;

public class Task19 {
    public static void execute() {
        Integer[] ints = {1, 5, 10, -45, 30};
        int maxInt = findMax(ints);
        System.out.println(maxInt);
        String[] strings = {"sjdyuft", "htfhg", "asiuyted"};
        System.out.println(findMax(strings));
    }


    public static <T extends Comparable<T>> T findMax(T[] array) {
        T maxObject = array[0];
        for (T obj : array) {
            if (maxObject.compareTo(obj) < 0) {
                maxObject = obj;
            }
        }
        return maxObject;
    }

}
