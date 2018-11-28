public class Monster {

    private String name;
    private int currentHp;
    private int maxHp;

    public Monster(String name) {
        this.name = name;
        maxHp = 100;
        currentHp = maxHp;
    }

    public String getName() {
        return name;
    }

}
