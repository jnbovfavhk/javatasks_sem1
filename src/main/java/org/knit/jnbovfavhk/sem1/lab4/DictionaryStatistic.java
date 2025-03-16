package org.knit.jnbovfavhk.sem1.lab4;

import java.util.StringJoiner;
import java.util.Random;

public class DictionaryStatistic {
    private String[] words;
    private int dictionarySize; // Количество слов
    private int polindrom; // Количество слов полиндромов
    private int maxWordLength; // маскимальная длина слова в словаре
    private int minWordLength; // минимальная длина слова в словаре
    private String alphabet; // буквы алфавита
    private int[] frequency; //частота букв в словаре (в кадой ячейке хранит частоту букв, а индрес - это позиция буквы в alpabet)
    private final Random rand;



    public DictionaryStatistic(String[] words) {
        this.words = words;
        alphabet = "";
        maxWordLength = 0;
        minWordLength = words[0].length();
        dictionarySize = words.length;
        rand = new Random();

        StringJoiner joiner = new StringJoiner(";");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < minWordLength) {
                minWordLength = words[i].length();
            }
            if (words[i].length() > maxWordLength) {
                maxWordLength = words[i].length();
            }
            if (isPalindrome(words[i])) {
                polindrom += 1;
            }
            joiner.add(words[i]);
        }
        for (int i='а'; i <= 'я'; i++) {
            alphabet += (char)i;
        }
        String joinedString = joiner.toString();
        frequency = new int[alphabet.length()];

        for (int i = 0; i < alphabet.length(); i++) {

            String a = String.valueOf(alphabet.charAt(i));
            frequency[i] = joinedString.split(a).length - 1;
        }
    }


    public int[] getFrequency() {
        return frequency;
    }


    public boolean isPalindrome(String a) {
        return new StringBuilder(a).reverse().toString().equals(a);
    }


    // Случайное слово из словаря
    public String getRandomWord() {

        return words[rand.nextInt(dictionarySize)];
    }


    // Kоличество встречающихся букв
    public void printSymbolsStat() {
        for (int i = 0; i < alphabet.length(); i++) {
            System.out.printf("%s - %d\n", alphabet.charAt(i), frequency[i]);
        }
    }

    public int getPolindrom() {
        return polindrom;
    }
}
