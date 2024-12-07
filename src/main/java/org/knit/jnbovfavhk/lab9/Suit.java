package org.knit.jnbovfavhk.lab9;

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
