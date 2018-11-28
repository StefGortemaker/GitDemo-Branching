public class Monster extends Entity {

    public Monster(String name) {
       super(name, 100, 5);
    }

    public void attack(Hero opponent) {
        System.out.println(getName() + " deals " + getAttackDamage() + " damage!");
        opponent.receiveDamage(getAttackDamage());
    }

}
