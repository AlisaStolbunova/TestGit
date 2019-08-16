package work.home.lesson7_OOP.hero;

public abstract class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  void attackEnemy(Enemy e){      // abstract!!!
        int damage;
        System.out.println(name + " attacks the enemy!");
        damage = (int) ((Math.random() * 90) + 10);
        System.out.println("Damage = " + damage);
        e.takeDamage(damage);
    }
}
