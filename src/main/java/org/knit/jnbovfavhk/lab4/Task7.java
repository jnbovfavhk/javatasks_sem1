package org.knit.jnbovfavhk.lab4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task7 {

    public void execute() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("resources/dictionary.txt"));
        while (scanner.hasNext()) {
            String word = scanner.nextLine();
            System.out.println(word);
        }
    }
}
