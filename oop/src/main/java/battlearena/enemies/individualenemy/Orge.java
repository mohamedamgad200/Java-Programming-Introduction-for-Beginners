package battlearena.enemies.individualenemy;

import battlearena.enemies.Enemy;
import battlearena.enemies.individualenemy.IOrge;

public class Orge extends Enemy implements IOrge {
    public Orge(int healthPoints, int attackDamage)
    {
        super(healthPoints,attackDamage);
    }
    @Override
    public void talk() {
        System.out.println("Ogre is slamming hands all around");
    }

    @Override
    public void specialAttack() {
        boolean didSpecialAttackWork=Math.random()<.20;
       if(didSpecialAttackWork)
       {
        setAttackDamage(getAttackDamage()+4);
           System.out.println("Ogre attack increased by 4");
       }
    }
    @Override
    public void attack(){
        System.out.println("Orge attacks for "+getAttackDamage()+" damage");
    }

    @Override
    public void stareDown() {
        System.out.println("Ogre eyes stare at opponent and it drops down to all four limbs");
    }
}

