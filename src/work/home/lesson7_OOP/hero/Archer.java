package work.home.lesson7_OOP.hero;

public class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy e) {
        super.attackEnemy(e);
    }
}
