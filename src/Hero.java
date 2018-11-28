public class Hero {
    private String name;
    private int currentHp;
    private int maxHp;

    private int level = 0;
    private int experienceTillNextLevel = 1000;

    private int attackDamage = 10;

    public Hero(String name) {
        this.name = name;
        maxHp = 100;
        currentHp = maxHp;
    }

    public String getName() {
        return name;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public boolean isDead() {
        return currentHp == 0;
    }

    public void attack(Monster opponent) {
        opponent.receiveDamage(attackDamage);
    }

    public void receiveDamage(int amount) {
        currentHp -= amount;
    }

    public void gainExperience(int amount) {
        experienceTillNextLevel -= amount;

        // Add levels for the amount of xp
        while(experienceTillNextLevel <= 0) {
            levelUp();
            experienceTillNextLevel += 1000;
        }
    }

    public int getLevel() {
        return level;
    }

    private void levelUp() {
        level++;
    }
}


