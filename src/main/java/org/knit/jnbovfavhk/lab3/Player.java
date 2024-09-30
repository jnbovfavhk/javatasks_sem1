package org.knit.jnbovfavhk.lab3;
import java.util.Random;

public abstract class Player {
    private final String name;
    private int health;
    private final int maxHealth;
    private boolean Status;
    private int xPos;
    private int yPos;
    private int damage;
    private final int shield;

    protected abstract void decreaseHealth(int Value);
    protected abstract void movePos(int x, int y);
    protected abstract void increaseHealth(int value);
    Random rand = new Random();

    protected int getDamage() {

        return rand.nextInt(damage) + damage;
    }

    protected String getName() {
        return name;
    }

    protected int getShield() {
        return shield;
    }

    protected int getMaxHealth() {
        return maxHealth;
    }

    protected void setStatus() {
        Status = false;
    }


    protected int getxPos() {
        return xPos;
    }

    protected void setxPos(int xPos) {
        this.xPos = xPos;
    }

    protected int getyPos() {
        return yPos;
    }

    protected void setyPos(int yPos) {
        this.yPos = yPos;
    }

    protected void setDamage(int damage) {
        this.damage = damage;
    }

    protected int getHealth() {
        return health;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    protected Player(String name) {
        this.name = name;
        this.health = 100;
        this.shield = 8;
        this.maxHealth = 100;
        this.Status = true;
        this.xPos = rand.nextInt(51);
        this.yPos = rand.nextInt(51);
        this.damage = 60;
    }

    public boolean isStatus() {
        return Status;
    }

    public String getSpecifications() {
        return "Имя: " + getName() +
                "\nЗдоровье: " + getHealth() +
                "\nСтатус: " + isStatus() +
                "\nКоординаты: " + getxPos() + ", " + getyPos() +
                "\nУрон: " + getDamage() +
                "\nЩит: " + getShield() + "\n";
    }
}
