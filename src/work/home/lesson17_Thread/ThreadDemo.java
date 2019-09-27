package work.home.lesson17_Thread;

/*
Создать поток, который будет в цикле итерироваться от 1 до 10 000 000 и суммировать каждый четный элементкратный 3.
На каждой итерации, кратной 1 000 000, поток должен заснуть на 10мс.
Вместе с суммирующим потоком запустить поток демон, который каждую пятую миллисекунду выводит в консоль текущее значение
просуммированных элементов
 */

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        MyDaemonThread dt = new MyDaemonThread();
        dt.start();


    }
}
