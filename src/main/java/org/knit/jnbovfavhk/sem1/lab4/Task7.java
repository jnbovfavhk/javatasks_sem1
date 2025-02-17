package org.knit.jnbovfavhk.sem1.lab4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static org.knit.jnbovfavhk.sem1.lab4.Check2string.check;


public class Task7 {

    public void execute() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("resources/dictionary.txt"));
        String[] words = Arrays.stream(scanner.tokens().toArray()).toArray(String[]::new);
        DictionaryStatistic ds = new DictionaryStatistic(words);
        System.out.println(ds.getRandomWord());
        ds.printSymbolsStat();
        System.out.println("Количество слов-палиндромов - " + ds.getPolindrom());
        System.out.print("\n\nВведите слово\n");

        Scanner scanner1 = new Scanner(System.in);
        String userword = scanner1.nextLine().toLowerCase();

        for (String word : words) {
            if (check(word, userword)) {
                System.out.println(word);
            }
        }

    }
}
