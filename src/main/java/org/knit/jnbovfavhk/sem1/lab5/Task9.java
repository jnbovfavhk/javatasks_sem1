package org.knit.jnbovfavhk.sem1.lab5;
import org.knit.jnbovfavhk.TaskDescription;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@TaskDescription(number = 1, description = "Создайте консольное приложение, которое в течение минуты," +
        " берет случайные слова из списка и предлагает пользователю их ввести.\n" +
        "\n" +
        "Приложение должно засекать время на 1 минуту. Через минуту последнее введенное слово не учитывается. " +
        "Если слово совпало с предложенным, то увеличиваем счетчик на 1. Через минуту подводим итог.")
public class Task9 {
    public static void execute() throws FileNotFoundException {

        List<String> list = getWords("resources/dictionary.txt");

        // текущее время в миллисекундах
        long timeMillis = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);
        // количество правильно введенных слов
        int correctCounter = 0;

        // количество слов, написанных компьютером
        int wordsCounter = 0;

        // количество букв, правильно введенных пользователем
        int symbolsCounter = 0;

        // в течение 60-ти секунд печатать рандомное слово из списка и добавлять балл, если пользователь написал то же самое
        Random random = new Random();
        while (System.currentTimeMillis() < timeMillis + 60000) {
            String word = list.get(random.nextInt(list.size()));
            System.out.println(word);
            wordsCounter++;
            String inputWord = scanner.next();

            // слово после окончания таймера не учитывается
            if (inputWord.equals(word) && System.currentTimeMillis() < timeMillis + 60000) {
                correctCounter++;
                symbolsCounter += inputWord.length();
            }

        }
        scanner.close();
        System.out.printf("Завершено. Вы успели написать %s слов за минуту\nВсего слов было: %s\nВаша скорость письма: %s символов в секунду", correctCounter, wordsCounter, symbolsCounter/60);
    }

    // получить список слов из файла по пути path
    public static List<String> getWords(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.nextLine());
        }
        scanner.close();
        return words;
    }
}
