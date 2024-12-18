package org.knit.jnbovfavhk.lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
