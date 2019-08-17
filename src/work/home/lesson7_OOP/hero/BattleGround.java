package work.home.lesson7_OOP.hero;

public class BattleGround {
    public static void main(String[] args) {
        Hero hero = new Warrior("Warrior", 1000);
        Enemy toxic = new Toxic(100);
        Enemy zombie = new Zombie(80);

        while (true) {
            combat(hero, toxic);
            combat(hero, zombie);
            if (!hero.isAlive()){
                System.out.println("Enemies won!");
                break;
            } else if (!toxic.isAlive() && !zombie.isAlive()){
                System.out.println("Hero won!");
                break;
            }
        }
    }

    private static void combat(Hero hero, Enemy enemy) {
        hero.attackEnemy(enemy);
        if (enemy.isAlive()) {
            System.out.println("Enemy is alive. Health = " + enemy.getHealth());
        }
        enemy.attackHero(hero);
        if (hero.isAlive()) {
            System.out.println(hero.getName() + " is alive. Health = " + hero.getHealth());
        }
    }
}
