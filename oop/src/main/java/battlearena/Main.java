package battlearena;

import battlearena.enemies.Enemy;
import battlearena.enemies.individualenemy.Orge;
import battlearena.enemies.individualenemy.Zombi;
import battlearena.heros.Hero;
import battlearena.heros.weapons.Weapon;

import static battlearena.enemies.Enemy.getNumberOfEnemies;

public class Main {
    public static void main(String[] args) {
        Zombi zombi = new Zombi(10, 1);
        Orge orge = new Orge(20, 3);
        System.out.println("There are " + getNumberOfEnemies() + " enemies ready to flight");
        zombi.spreadDisease();
        zombi.battleStance();
        orge.stareDown();
        battel(zombi, orge);
        Weapon weapon=new Weapon("Sword",5);
        Hero hero=new Hero(25,2);
        hero.setWeapon(weapon);
        hero.equipWeapon();
        heroBattle(hero,zombi);

    }

    public static void battel(Enemy e1, Enemy e2) {
        e1.talk();
        e1.attack();
        while (e1.getHealthPointsRemaining() > 0 && e2.getHealthPointsRemaining() > 0) {
            System.out.println("--------");
            e1.specialAttack();
            e2.specialAttack();
            System.out.println("Enemy 1" + e1.getHealthPointsRemaining() + " HP Left");
            System.out.println("Enemy 2" + e2.getHealthPointsRemaining() + " HP Left");
            e2.attack();
            e1.setHealthPointsRemaining(e1.getHealthPointsRemaining() - e2.getAttackDamage());
            e1.attack();
            e2.setHealthPointsRemaining(e2.getHealthPointsRemaining() - e1.getAttackDamage());
        }
        System.out.println("------------ Final game -----------");
        if (e1.getHealthPointsRemaining() > 0) {
            System.out.println("Enemy 1 wins!");
        } else {
            System.out.println("Enemy 2 wins!");
        }
    }

    public static void heroBattle(Hero hero, Enemy enemy) {
        while (hero.getHealthPointsRemaining()>0&&enemy.getHealthPointsRemaining()>0) {
            System.out.println("-------------");
            enemy.specialAttack();
            System.out.println("Hero " + hero.getHealthPointsRemaining() + " HP Left");
            System.out.println("Enemy " + enemy.getHealthPointsRemaining() + " HP Left");
            enemy.attack();
            enemy.setHealthPointsRemaining(enemy.getHealthPointsRemaining() - enemy.getAttackDamage());
            hero.attack();
            hero.setHealthPointsRemaining(hero.getHealthPointsRemaining() - hero.getAttackDamage());

        }
        System.out.println("------------ Final game -----------");
        if (hero.getHealthPointsRemaining() > 0) {
            System.out.println("Hero wins!");
        } else {
            System.out.println("Enemy wins!");
        }
    }
}
