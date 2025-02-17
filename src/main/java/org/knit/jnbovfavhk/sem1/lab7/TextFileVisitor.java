package org.knit.jnbovfavhk.sem1.lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class TextFileVisitor implements FileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Файлы в " + dir.toString() + ":");
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.toString().endsWith(".txt")) {
            long countOfWords = countWords(file);
            System.out.println(file + " - " + countOfWords);
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Не удалось открыть файл: " + file.toString());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Папка " + dir + " покинута");
        return FileVisitResult.CONTINUE;
    }
    public long countWords(Path file) {
        long countOfWords = 0;
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Разбиваем строку на слова, используя пробелы и другие разделители
                String[] words = line.split("\\s+");
                countOfWords += words.length;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return countOfWords;
    }
}
