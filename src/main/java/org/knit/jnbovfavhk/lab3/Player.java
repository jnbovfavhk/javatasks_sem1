package org.knit.jnbovfavhk.lab3;

public abstract class Player {
    private String name;
    private int health;
    private int maxHealth;
    private boolean Status;
    private int xPos;
    private int yPos;
    private int damage;
    private int shield;

    protected abstract void decreaseHealth(int Value);
    protected abstract void movePos(int x, int y);
    protected abstract void increaseHealth(int value);

    public int getDamage() {
        return damage;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
