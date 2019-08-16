package work.home.lesson7_OOP.hero;

public class Warrior extends Hero {


    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy e) {
        super.attackEnemy(e);
    }
}
