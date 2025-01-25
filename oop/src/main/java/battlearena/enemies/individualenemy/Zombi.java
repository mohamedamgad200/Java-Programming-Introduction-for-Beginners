package battlearena.enemies.individualenemy;

import battlearena.enemies.Enemy;
import battlearena.enemies.individualenemy.IZombi;

public class Zombi extends Enemy implements IZombi {
    public Zombi(int healthPoints, int attackDamage)
    {
        super(healthPoints,attackDamage);
    }
    @Override
    public void talk(){
        System.out.println("*Grumbling...*");
    }
    public void spreadDisease(){
        System.out.println("The zombie is trying to spread infection");
    }
    @Override
    public void specialAttack(){
        boolean didSpecialAttackWork=Math.random()<.50;
        if(didSpecialAttackWork)
        {
            setAttackDamage(getAttackDamage()+2);
            System.out.println("Zombie regenerated 2 HP");
        }
    }

    @Override
    public void attack() {
        System.out.println("Zombie attacks for "+getAttackDamage()+" damage");
    }

    @Override
    public void battleStance() {
        System.out.println("Zombie cracks neck and sticks arms out.");
    }
}
