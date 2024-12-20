package org.knit.jnbovfavhk.lab11;

public class User {
    private String name;
    private String email;


    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
