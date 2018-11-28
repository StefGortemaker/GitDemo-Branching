public class Hero {
    private String name;
    private int currentHp;
    private int maxHp;

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
}


