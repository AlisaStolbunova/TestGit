package work.home.lesson7_OOP.hero;

public class Mage extends Hero {
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy e) {
        super.attackEnemy(e);
    }
}
