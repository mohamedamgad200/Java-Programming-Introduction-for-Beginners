package battlearena.enemies;

public abstract class Enemy implements IEnemt {
    private int healthPoints;
    private int healthPointsRemaining;
    private int attackDamage;
    private int id;
    static int numberOfEnemies;

    public Enemy(int healthPoints, int attackDamage) {
        this.attackDamage = attackDamage;
        this.healthPoints = healthPoints;
        this.healthPointsRemaining = this.healthPoints;
        numberOfEnemies++;
        this.id = numberOfEnemies;
    }

    @Override
    public void specialAttack() {
        System.out.println("Enemy does not have any special attack. ");
    }
    @Override
    public int getHealthPointsRemaining() {
        return healthPointsRemaining;
    }
    @Override
    public void setHealthPointsRemaining(int healthPointsRemaining) {
        this.healthPointsRemaining = healthPointsRemaining;
    }
    @Override
    public int getAttackDamage() {
        return attackDamage;
    }
    @Override
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public int getHealthPoints() {
        return healthPoints;
    }
    @Override
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public static int getNumberOfEnemies() {
        return numberOfEnemies;
    }
    @Override
    public void talk() {
        System.out.println("I am a enemy" + " be prepared to fight!");
    }

    public void walkForward() {
        System.out.println("enemy moves closer to you");
    }

    @Override
    public void attack() {
        System.out.println(" enemy attacks for " + attackDamage + " damage ");
    }
}
