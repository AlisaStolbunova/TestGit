package work.home.lesson7_OOP.hero;

public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Warrior");
        Enemy enemy = new Enemy(100);
        warrior.attackEnemy(enemy);
        if(enemy.isAlive()){
            System.out.println("Enemy is Alive. Health = " + enemy.getHealth());
        }
    }
}
