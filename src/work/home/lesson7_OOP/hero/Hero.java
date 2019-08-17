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

    public abstract void  attackEnemy(Enemy e);

    public int takeDamage(int damage) {
        return health -= damage;
    }

    @Override
    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else return false;
    }
}
