package org.knit.jnbovfavhk.sem1.lab8;

import java.io.Serializable;

public class User implements Serializable {
    private final String name;
    private final int age;
    private final String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getInfo() {
        return "Имя: " + getName() + ", Возраст: " + getAge() + ", Email: " + getEmail();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
