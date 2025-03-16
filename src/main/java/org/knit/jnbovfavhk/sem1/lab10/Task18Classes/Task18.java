package org.knit.jnbovfavhk.sem1.lab10.Task18Classes;

import org.knit.jnbovfavhk.TaskDescription;

@TaskDescription(number = 18, description = "Создайте универсальный класс Pair, который " +
        "будет хранить две связанные сущности. Напишите методы для получения и изменения значений.", href = "org/knit/jnbovfavhk/sem1/lab10/Task18Classes")
public class Task18 {
    public static void execute() {
        Pair<String, Long> pair = new Pair<String, Long>("ID", Long.valueOf("7429835648702"));
        System.out.println(pair.getValue1());
        System.out.println(pair.getValue2());
    }
}
