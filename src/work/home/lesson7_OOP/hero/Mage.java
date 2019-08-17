package work.home.lesson7_OOP.hero;

public class Mage extends Hero {
    public Mage(String name, int health) {
        super(name, health);
    }

    public  void attackEnemy(Enemy e){
        int damage;
        System.out.println(getName() + " attacks the enemy!");
        damage = (int) ((Math.random() * 90) + 10);
        System.out.println("Damage = " + damage);
        e.takeDamage(damage);
    }
}
