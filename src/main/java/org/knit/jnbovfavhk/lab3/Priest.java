package org.knit.jnbovfavhk.lab3;

public class Priest extends Player implements Healing, Moving{
    public Priest(String name) {
        super(name);
        setDamage(10);

        System.out.println("Священник под именем " + getName() + " появился на поле. Характеристики: \n" +
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
    public void heal(Player player) {
        if (isStatus() && player.isStatus()) {
            if (Math.pow(player.getxPos() - getxPos(), 2) + Math.pow(player.getyPos() - getyPos(), 2) < 70) {

                int currentDamage = getDamage();
                player.increaseHealth(getDamage());
                System.out.printf("\n%s восполнил игроку %s  %s здоровья\n", getName(), player.getName(), currentDamage);
                if (player.getHealth() > player.getMaxHealth()) {
                    System.out.printf("\nУ игрока %s полное здоровье\n", player.getName());
                    player.setHealth(player.getMaxHealth());
                }
            } else {
                System.out.printf("\n%s попытался помочь %s, но не дотянулся! Какая жалость!\n", getName(), player.getName());
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
