package org.knit.jnbovfavhk.sem1.lab3;

public class Warrior extends Player implements Moving, Hit{

    public Warrior(String name) {
        super(name);

        System.out.println("Воин под именем " + getName() + " появился на поле. Характеристики: \n" +
                getSpecifications());
    }

    @Override
    public void moveTo(int x, int y) {
        if (isStatus()) {
            movePos(x, y);
            System.out.printf("\n%s переместился на координаты %s, %s", getName(), getxPos(), getyPos());
        }
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
    protected void increaseHealth(int value) {
        setHealth(getHealth() + value);
    }

    @Override
    public void attack(Player player) {
        if (isStatus() && player.isStatus()) {
            if (Math.pow(player.getxPos() - getxPos(), 2) + Math.pow(player.getyPos() - getyPos(), 2) < 70) {
                int currentDamage = player.getHealth();
                player.decreaseHealth(getDamage());
                currentDamage -= player.getHealth();
                System.out.printf("\n%s атакует игрока %s мечом и наносит ему %s урона!", getName(), player.getName(), currentDamage);
                if (player.getHealth() < 1) {
                    System.out.printf("\n%s умер..", player.getName());
                    player.setStatus();
                }
            } else {
                System.out.printf("\n%s попытался атаковать %s, но не дотянулся! Какая жалость!", getName(), player.getName());

            }
        }
    }
}
