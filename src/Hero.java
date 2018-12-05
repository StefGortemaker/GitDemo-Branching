public class Hero extends Entity {


    public Hero(String name) {
        super(name, 100, 10);
    }


    public void attack(Monster opponent) {
        System.out.println(getName() + " deals " + getAttackDamage() + " damage!");
        opponent.receiveDamage(getAttackDamage());
=======
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
>>>>>>> origin/weapons
    }

}


