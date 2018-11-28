public class Hero {
    private String name;
    private int currentHp;
    private int maxHp;

    private int attackDamage;

    private Weapon equippedWeapon;

    public Hero(String name) {
        this.name = name;
        maxHp = 100;
        currentHp = maxHp;
        attackDamage = 10;
        equippedWeapon = null;
    }

    public String getName() {
        return name;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void equip(Weapon w) {
        this.equippedWeapon = w;
    }

    public boolean isDead() {
        return currentHp == 0;
    }

    public void attack(Monster opponent) {
        int dealtDamage = attackDamage;

        if(equippedWeapon != null) {
            dealtDamage += equippedWeapon.getBonusDamage();
        }

        opponent.receiveDamage(dealtDamage);
    }

    public void receiveDamage(int amount) {
        currentHp -= amount;
    }
}


