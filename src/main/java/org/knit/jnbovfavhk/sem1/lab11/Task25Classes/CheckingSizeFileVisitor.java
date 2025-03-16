package org.knit.jnbovfavhk.sem1.lab11.Task25Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class CheckingSizeFileVisitor implements FileVisitor<Path> {
    private boolean allFilesUnder50MB = true;
    private final int sizeOfFile; //default value

    public CheckingSizeFileVisitor() {
        sizeOfFile = 50 * 1024 * 1024;
    }

    public CheckingSizeFileVisitor(int sizeOfFile) {
        this.sizeOfFile = sizeOfFile;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        try (BufferedReader reader = new BufferedReader(Files.newBufferedReader(file))) {
            int countOfBytes = 0;
            int symbol = reader.read();
            while (symbol != -1) {
                countOfBytes += 1;
                symbol = reader.read();
            }



            if (countOfBytes < sizeOfFile) {
                return FileVisitResult.CONTINUE;
            } else {
                allFilesUnder50MB = false;
                return FileVisitResult.TERMINATE;
            }
        }
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    public boolean isAllFilesUnder50MB() {
        return allFilesUnder50MB;
    }
}
