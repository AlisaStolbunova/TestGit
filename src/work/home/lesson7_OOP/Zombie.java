package work.home.lesson7_OOP;

public class Zombie extends Enemy {
    boolean flag = true;

    public Zombie(int health) {
        super(health);
    }

    @Override
    public boolean isAlive() {
        if (!super.isAlive()) {
            if (flag) {
                setHealth(30);
                System.out.println("Zombie revival. Zombie health = " + getHealth());
                flag = false;
                return true;
            } else return false;
        } else return true;
    }


}
