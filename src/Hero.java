public class Hero extends Entity {


    public Hero(String name) {
        super(name, 100, 10);
    }


    public void attack(Monster opponent) {
        System.out.println(getName() + " deals " + getAttackDamage() + " damage!");
        opponent.receiveDamage(getAttackDamage());
    }

}


