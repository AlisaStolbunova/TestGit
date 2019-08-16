package work.home.lesson5_wrappers;

/*Определить класс, который при инициализации принимает на вход 2 аргумента целого или вещественного типа. Задать
перегруженные методы возвращающие результат арифметических операций над заданными полями и полями типа BigDecimal
 */

public class A {
    double a;
    double b;

    public A() {
    }

    public A(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double res(double a, double b) {
        return a - b;
    }

    public double mult(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b != 0)
            return a / b;
        else {
            System.out.println("Division by zero!!!");
            return 0;
        }
    }


    public double pow(double a, double b) {
        int c = 1;
        for (int i = 1; i <= b; i++) {
            c *= a;
        }
        return c;
    }

    public double sqrt(double a) {
        double min = 0;
        double max = a;
        double mid = 0;
        for (int i = 0; i < 1000; i++) {
            mid = (min + max) / 2;
            if (mid * mid == a) return mid;
            if (mid * mid > a) {
                max = mid;
            } else min = mid;
        }
        return mid;
    }

    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.sqrt(10000));
    }

}
