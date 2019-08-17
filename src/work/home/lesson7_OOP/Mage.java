package work.home.lesson7_OOP;

public class Mage extends Hero {
    public Mage(String name, int health) {
        super(name, health);
    }

    public  void attackEnemy(Enemy e){
        int damage;
        System.out.println(getName() + " attacks the enemy!");
        damage = (int) (Math.random() * 50);
        System.out.println("Damage = " + damage);
        e.takeDamage(damage);
    }
}
