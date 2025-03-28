package org.knit.jnbovfavhk.sem1.lab2.Task5Classes;

import org.knit.jnbovfavhk.TaskDescription;

@TaskDescription(number = 5, description = "Реализация простой файловой системы", href = "org/knit/jnbovfavhk/sem1/lab2/Task5Classes")
public class Task5 {
    public static void execute() {
        // Создаем файлы
        FileSystemComponent file1 = new File("file1.txt", 100);
        FileSystemComponent file2 = new File("file2.txt", 200);
        FileSystemComponent file3 = new File("file3.txt", 300);

        // Создаем папки
        FileSystemComponent folder1 = new Folder("Folder1");
        FileSystemComponent folder2 = new Folder("Folder2");

        // Добавляем файлы в папки
        folder1.add(file1);
        folder1.add(file2);

        folder2.add(file3);
        folder2.add(folder1); // Вложенная папка

        // Проверка методов, неприменимых к файлу
        file3.add(file1);
        file3.display("");

        // Выводим структуру файловой системы
        folder2.display("");

        // Выводим общий размер папки 2
        System.out.println("Total size of Folder2: " + folder2.getSize() + " bytes");

        folder2.remove(file1);
        folder2.remove(file3);
        folder2.display("");

        System.out.println("Total size of Folder2: " + folder2.getSize() + " bytes");
    }
}
