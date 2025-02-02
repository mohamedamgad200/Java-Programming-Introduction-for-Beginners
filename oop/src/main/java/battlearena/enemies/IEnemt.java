package battlearena.enemies;

public interface IEnemt {
    void talk();

    void attack();

    int getHealthPoints();

    void setHealthPoints(int healthPoints);

    int getAttackDamage();

    void setAttackDamage(int attackDamage);

    int getHealthPointsRemaining();

    void setHealthPointsRemaining(int healthPointsRemaining);

    void specialAttack();

    int getId();
}
