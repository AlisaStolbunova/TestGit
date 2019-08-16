package work.home.lesson7_OOP.hero;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(){
        System.out.println(name + " attacks the enemy!");
    }
}
