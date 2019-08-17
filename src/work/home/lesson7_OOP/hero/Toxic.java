package work.home.lesson7_OOP.hero;

public class Toxic extends Enemy {
    public Toxic(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero h) {
        int poison = (int) (Math.random() * 10);
        int damage;
        System.out.println("Enemy attacks the hero!");
        System.out.println("Enemy is poisoning the hero!");
        damage = (int) (Math.random() * 50);
        System.out.println("Damage + poison = " + (damage + poison));
        h.takeDamage(damage + poison);

    }


}
