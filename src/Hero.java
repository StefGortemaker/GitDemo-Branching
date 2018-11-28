public class Hero extends Entity {


    public Hero(String name) {
        super(name, 100, 10);
    }


    public void attack(Monster opponent) {
        opponent.receiveDamage(getAttackDamage());
    }

}


