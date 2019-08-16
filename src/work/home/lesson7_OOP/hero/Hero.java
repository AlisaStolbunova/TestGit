package work.home.lesson7_OOP.hero;

public abstract class Hero implements Mortal {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public  void attackEnemy(Enemy e){      // abstract!!!
        int damage;
        System.out.println(name + " attacks the enemy!");
        damage = (int) ((Math.random() * 90) + 10);
        System.out.println("Damage = " + damage);
        e.takeDamage(damage);
    }

    public int takeDamage(int damage){
        return health -= damage;
    }

    @Override
    public boolean isAlive() {
        if(health > 0) {
            return true;
        }
        else return false;
    }
}
