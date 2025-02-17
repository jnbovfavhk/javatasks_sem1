package org.knit.jnbovfavhk.sem1.lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task10 {

    public static void execute() throws FileNotFoundException {
        Random random = new Random();
        Scanner scannerForData = new Scanner(new File("C:\\Users\\belonozhkoin\\IdeaProjects\\javatasks\\resources\\dictionary.txt"));
        List<String> possibleWords = new ArrayList<>();
        while (scannerForData.hasNext()) {
            possibleWords.add(scannerForData.next());
        }
        String pickedWord = possibleWords.get(random.nextInt(possibleWords.size()));
        int wrongAttempts = 0;
        List<Character> solvedLetters = new ArrayList<>();
        for (Character ignored : pickedWord.toCharArray()) {
            solvedLetters.add('_');
        }

        while (wrongAttempts < 10) {

            for (int i = 0; i < pickedWord.length(); i++) {
                System.out.print(solvedLetters.get(i));
            }
            System.out.println("\nВведите букву");

            String inputString = getInputString();
            while (inputString.length() != 1) {
                if (inputString.equals(pickedWord)) {
                    System.out.println("Победа");
                    return;
                } else {
                    System.out.println("Введите одну букву");
                    inputString = getInputString();
                }
            }

            if (pickedWord.contains(String.valueOf(inputString.charAt(0)))) {
                for (int i = 0; i < pickedWord.length(); i++) {
                    if (inputString.charAt(0) == pickedWord.charAt(i)) {
                        solvedLetters.set(i, pickedWord.charAt(i));
                        if (!solvedLetters.contains('_')) {
                            System.out.println("Победа");
                            return;
                        }
                    }
                }
            } else {
                wrongAttempts++;
            }
        }
    }

    public static String getInputString() {
        Scanner inputScanner = new Scanner(System.in);
        return inputScanner.nextLine();
    }
}
