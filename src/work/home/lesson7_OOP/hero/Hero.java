package work.home.lesson7_OOP.hero;

/*
Создать класс Hero, представляющий собой героя и содержащий поле name.
Добавить конструктор, принимающий имя героя и геттер для имени (сеттер не нужен).
Добавить метод attackEnemy(), выводящий в консоль сообщение о том, что герой атакует врага.
Создать класс TrainingGround,содержащий метод main. Протестировать создание героя и его атаку.
 */

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
