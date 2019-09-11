package work.home.lesson12_Generics;

public class Arithmetic <T extends Number>{
    public T t1;
    public T t2;

    public Arithmetic(T t1, T t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public Arithmetic(T t1) {
        this.t1 = t1;
    }


    public double getSum() {
        return (t1.doubleValue() + t2.doubleValue());
    }

    public double getSub() {
        return t1.doubleValue() - t2.doubleValue();
    }

    public double getMultiply() {
        return t1.doubleValue() * t2.doubleValue();
    }

    public double getDivide(){
        if (t2.doubleValue() != 0)
            return t1.doubleValue() / t2.doubleValue();
        else
            throw new ArithmeticException("Division by zero!");
    }


    public double pow() {
        return Math.pow(t1.doubleValue(), t2.byteValue());
    }

    public double abs() {
        return (t1.doubleValue() < 0 ? -t1.doubleValue() : t1.doubleValue());
    }





}
