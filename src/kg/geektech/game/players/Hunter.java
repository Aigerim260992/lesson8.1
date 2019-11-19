package kg.geektech.game.players;

import kg.geektech.game.boss.Boss;
import kg.geektech.game.general.AbilityType;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Hunter extends Hero {
    public Hunter(int health, int damage) {
        super(health, damage, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

        Random r = new Random(2);
        int run = r.nextInt(4);
        heroes[2].setDamage(heroes[2].getDamage()+ run);
        System.out.println("Hunter увеличил свою атаку");


    }

}
