package org.knit.jnbovfavhk.sem1.lab9;

public enum Suit {
    HEARTS("Черви"),
    DIAMONDS("Бубны"),
    CLUBS("Трефы"),
    SPADES("Пики");

    private final String suitName;
    Suit(String suitName) {
        this.suitName = suitName;
    }

    public String getSuitName() {
        return suitName;
    }
}
