package org.knit.jnbovfavhk.sem1.lab7;

import org.knit.jnbovfavhk.TaskDescription;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@TaskDescription(number = 12, description = "\n" +
        "    Обойти все файлы в указанной директории и ее подкаталогах.\n" +
        "    Если файл имеет расширение .txt, подсчитать количество слов в нем.\n" +
        "    Вывести общее количество слов во всех текстовых файлах.\n")
public class Task12 {
    public static void execute() {
        Path directoryToWalk = Paths.get("resources");
        try {
            Files.walkFileTree(directoryToWalk, new TextFileVisitor());
            System.out.println("Конец");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
