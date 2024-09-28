package org.knit.jnbovfavhk.lab3;

public class Mage extends Player implements SpellCast, Moving{

    @Override
    protected void increaseHealth(int value) {
        setHealth(getHealth() + value);
    }

    @Override
    protected void decreaseHealth(int value) {
        setHealth(getHealth() - value + getShield());
    }

    @Override
    protected void movePos(int x, int y) {
        setxPos(getxPos() + x);
        setyPos(getyPos() + y);
    }

    @Override
    public void castSpell(Player player) {
        player.decreaseHealth(getDamage());
    }

    @Override
    public void moveTo(int x, int y) {
        movePos(x, y);
    }
}
