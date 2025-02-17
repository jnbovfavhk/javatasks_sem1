package org.knit.jnbovfavhk.sem1.lab10;

public class Task22 {
    public static void execute() {
        Dictionary<String, Integer> dictionary = new Dictionary<>();
        dictionary.add("Alice", 25);
        dictionary.add("Bob", 30);
        System.out.println(dictionary.get("Alice")); // 25

        Dictionary<Double, Character> dict2 = new Dictionary<>();
        dict2.add(90.2, 'd');
        dict2.add(3.14, 'p');
        dict2.add(2.72, 'e');

        dict2.remove(90.2);

        System.out.println(dict2.get(2.72));
        System.out.println(dict2.get(3.14));
    }
}
