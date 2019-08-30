package work.home.lesson5_wrappers;

/*Определить класс, который при инициализации принимает на вход 2 аргумента целого или вещественного типа. Задать
перегруженные методы возвращающие результат арифметических операций над заданными полями и полями типа BigDecimal
 */

import java.math.BigDecimal;

public class A {
    double a;
    double b;


    public A(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double sum() {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double sum(int a, int b) {
        return a + b;
    }

    public BigDecimal sum(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    public double sub() {
        return a - b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double sub(int a, int b) {
        return a - b;
    }

    public BigDecimal sub(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    public double multiply() {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double multiply(int a, int b) {
        return a * b;
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public double divide() {
        if (b != 0)
            return a / b;
        else
            throw new ArithmeticException("Division by zero!");
    }

    public double divide(double a, double b) {
        if (b != 0)
            return a / b;
        else
            throw new ArithmeticException("Division by zero!");
    }

    public double divide(int a, int b) {
        if (b != 0)
            return a / b;
        else
            throw new ArithmeticException("Division by zero!");
    }

    public BigDecimal divide(BigDecimal a, BigDecimal b) {
        if (b.signum() != 0)
            return a.divide(b);
        else
            throw new ArithmeticException("Division by zero!");
    }


    public double pow() {
        return Math.pow(a, b);
    }

    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public double pow(int a, int b) {
        return Math.pow(a, b);
    }

    public BigDecimal pow(BigDecimal a, int b) {
        return a.pow(b);
    }

    public double abs() {
        return (a < 0 ? -a : a);
    }

    public double abs(double a) {
        return (a < 0 ? -a : a);
    }

    public double abs(int a) {
        return (a < 0 ? -a : a);
    }

    public BigDecimal abs(BigDecimal a) {
        return (a.signum() < 0 ? a.negate() : a);
    }


}
