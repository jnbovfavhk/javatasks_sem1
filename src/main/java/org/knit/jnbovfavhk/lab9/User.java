package org.knit.jnbovfavhk.lab9;

import java.util.Random;

public class User {

    @NotNull
    private final String login;

    @MaxLength(20)
    private final String password;

    @Min(10)
    private final int number;

    public User(String login, String password, int number) {
        this.login = login;
        this.password = password;
        this.number = number;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return null;
    }
}
