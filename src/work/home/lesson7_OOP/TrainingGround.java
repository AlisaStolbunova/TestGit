package work.home.lesson7_OOP;

/*
1. 1. Создать класс Hero, представляющий собой героя и содержащий поле name.
Добавить конструктор, принимающий имя героя и геттер для имени (сеттер не нужен).
Добавить метод attackEnemy(), выводящий в консоль сообщение о том, что герой атакует врага.
Создать класс TrainingGround,содержащий метод main. Протестировать создание героя и его атаку.

2. Создать классы Warrior, Mage и Archer, представляющие собой наследников класса Hero
Переопределить в них метод attackEnemy() для вывода специализированного для этого класса сообщения об атаке.
Протестировать создание героев различных классов и их атаки в классе TrainingGround

 */

public class TrainingGround {
    public static void main(String[] args) {
        //Hero hero = new Hero("Captain America");
        Enemy enemy = new Enemy(100);
        //hero.attackEnemy(enemy);

        Warrior warrior = new Warrior("Warrior", 100);
        warrior.attackEnemy(enemy);

        Mage mage = new Mage("Mage", 100);
        mage.attackEnemy(enemy);

        Archer archer = new Archer("Archer", 100);
        archer.attackEnemy(enemy);

    }
}
