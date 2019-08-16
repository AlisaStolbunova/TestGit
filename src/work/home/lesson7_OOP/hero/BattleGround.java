package work.home.lesson7_OOP.hero;

public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Warrior", 100);
        Enemy enemy = new Enemy(100);

        boolean flag = true;
        while (flag) {
            warrior.attackEnemy(enemy);
            if (enemy.isAlive()) {
                System.out.println("Enemy is Alive. Health = " + enemy.getHealth());
                enemy.attackHero(warrior);
                if (warrior.isAlive()) {
                    System.out.println("Hero is Alive. Health = " + warrior.getHealth());
                } else {
                    System.out.println("Enemy is win!");
                    flag = false;
                }
            } else {
                System.out.println("Hero is win!");
                flag = false;
            }
        }
    }
}
