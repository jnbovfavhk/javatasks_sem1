package org.knit.jnbovfavhk.lab4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

    public void execute() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("resources/dictionary.txt"));
        String[] words = Arrays.stream(scanner.tokens().toArray()).toArray(String[]::new);
        DictionaryStatistic ds = new DictionaryStatistic(words);
        System.out.println(ds.getRandomWord());
        System.out.println(Arrays.toString(ds.getFrequency()));
        ds.printSymbolsStat();
    }
}
