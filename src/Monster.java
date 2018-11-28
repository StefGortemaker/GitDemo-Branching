public class Monster {

    private String name;
    private int currentHp;
    private int maxHp;

    private int attackDamage = 5;

    public Monster(String name) {
        this.name = name;
        maxHp = 100;
        currentHp = maxHp;
    }

    public String getName() {
        return name;
    }

    public boolean isDead() {
        return currentHp == 0;
    }

    public void attack(Hero opponent) {
        opponent.receiveDamage(attackDamage);
    }

    public void receiveDamage(int amount) {
        currentHp -= amount;
    }
}
