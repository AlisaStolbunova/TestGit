package work.home.lesson7_OOP;

public class Archer extends Hero {
    public Archer(String name, int health) {
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
