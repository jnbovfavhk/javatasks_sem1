package org.knit.jnbovfavhk.lab3;
import java.util.Random;

public class Task6 {
    public void execute() {
        Mage mage1 = new Mage("Magistranto");
        Warrior warrior1 = new Warrior("borov");
        Priest priest = new Priest("iampriest");
        Random rand = new Random();

        while (mage1.isStatus() && warrior1.isStatus() || warrior1.isStatus() && priest.isStatus()) {
            mage1.moveTo(rand.nextInt(40), rand.nextInt(40));
            mage1.castSpell(warrior1);
            if (mage1.isStatus()) {
                warrior1.moveTo(rand.nextInt(40), rand.nextInt(40));
                warrior1.attack(mage1);
            }
            else {
                warrior1.moveTo(priest.getxPos(), priest.getyPos());
            }
            warrior1.attack(priest);
            priest.moveTo(rand.nextInt(40), rand.nextInt(40));
            priest.heal(mage1);
        }
        System.out.print("\n");
        System.out.printf((warrior1.isStatus()) ? warrior1.getName() + " победил" : mage1.getName() + " и " + priest.getName() + " победили");
    }
}
