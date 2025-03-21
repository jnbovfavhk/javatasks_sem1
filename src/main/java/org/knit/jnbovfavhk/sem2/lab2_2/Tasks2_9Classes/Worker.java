package org.knit.jnbovfavhk.sem2.lab2_2.Tasks2_9Classes;

import java.util.Random;

public class Worker {
    protected Factory factory;
    protected final Random random;

    public Worker(Factory factory) {

        this.factory = factory;
        this.random = new Random();
    }
}
