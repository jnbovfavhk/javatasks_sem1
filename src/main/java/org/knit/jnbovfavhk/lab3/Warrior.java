package org.knit.jnbovfavhk.lab3;

public class Warrior extends Player implements Moving, Hit{

    @Override
    public void moveTo(int x, int y) {
        movePos(x, y);
    }

    @Override
    protected void decreaseHealth(int value) {
        setHealth(getHealth() - value + getShield());
    }

    @Override
    protected void movePos(int x, int y) {
        setxPos(getxPos() + x);
        setShield(getyPos());
    }

    @Override
    protected void increaseHealth(int value) {
        setHealth(getHealth() + value);
    }

    @Override
    public void attack(Player player) {
        player.decreaseHealth(getDamage());
    }
}
