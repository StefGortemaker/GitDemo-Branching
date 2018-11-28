public abstract class Entity {

    private String name;
    private int currentHp;
    private int maxHp;

    private int attackDamage = 10;

    public Entity(String name, int maxHp, int attackDamage) {
        this.name = name;
        this.currentHp = maxHp;
        this.maxHp = maxHp;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public boolean isDead() {
        return currentHp == 0;
    }

    public void receiveDamage(int amount) {
        currentHp -= amount;
    }


}
