package org.knit.jnbovfavhk.sem1.lab3;

public class Mage extends Player implements SpellCast, Moving{

    public Mage(String name) {
        super(name);
        setDamage(60);

        System.out.println("Маг под именем " + getName() + " появился на поле. Характеристики:\n" +
                getSpecifications());
    }

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
        setxPos(x);
        setyPos(y);
    }

    @Override
    public void castSpell(Player player) {
        if (isStatus() && player.isStatus()) {
            if (Math.pow(player.getxPos() - getxPos(), 2) + Math.pow(player.getyPos() - getyPos(), 2) < 100) {
                int currentDamage = player.getHealth();
                player.decreaseHealth(getDamage());
                currentDamage -= player.getHealth();
                System.out.printf("\n%s кастует на игрока %s заклятие и наносит ему %s урона!", getName(), player.getName(), currentDamage);
                if (player.getHealth() < 1) {
                    System.out.printf("\n%s умер..", player.getName());
                    player.setStatus();
                }
            } else {
                System.out.printf("\n%s попытался наслать заклинание, но промазал!", getName());
            }
        }
    }

    @Override
    public void moveTo(int x, int y) {
        if (isStatus()) {
            movePos(x, y);
            System.out.printf("\n%s переместился на координаты %s, %s", getName(), getxPos(), getyPos());
        }
    }
}
