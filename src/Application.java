public class Application {

    public static void main(String[] args) {
        new Application().run();
    }

    public void run() {
        Hero ourHero = new Hero("Garfield");

        Monster viciousMonster = new Monster("Dreadful monday morning");

        while(!ourHero.isDead() && !viciousMonster.isDead()) {
            System.out.println(ourHero.getName() + " attacks " + viciousMonster.getName());
            ourHero.attack(viciousMonster);
            // The monster always gets to retaliate!
            System.out.println(viciousMonster.getName() + " attacks " + ourHero.getName());
            viciousMonster.attack(ourHero);
        }

        if(ourHero.isDead()) {
            System.out.println(viciousMonster.getName() + " won!");
        } else {
            System.out.println(ourHero.getName() + " won!");
            ourHero.gainExperience(viciousMonster.getExperienceValue());
        }

    }
}
