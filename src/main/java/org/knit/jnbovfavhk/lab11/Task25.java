package org.knit.jnbovfavhk.lab11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.Scanner;

public class Task25 {
    public static void execute() throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Напишите путь к файлу или папке:");
        String pathString = scanner.next();
        Path path = Path.of(pathString);

        CheckingSizeFileVisitor fileVisitor = new CheckingSizeFileVisitor();
        Files.walkFileTree(path, fileVisitor);

        if (fileVisitor.isAllFilesUnder50MB()) {
            Files.walkFileTree(path, new SaveToSQLBaseFileVisitor());
            System.out.println("Файлы успешно записаны в таблицу");
        } else {
            System.out.println("Какие-то файлы больше 50 Мб, записать не получилось");
        }


    }

}
