package work.home.lesson10_Innerclass;

public class Ellipse implements Shape {
    private double a;
    private double b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (a + b);
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public String toString() {
        return "Ellipse " +
                "a = " + a +
                ", b = " + b +
                ", Long = " + String.format("%.2f",getPerimeter()) +
                ", Area = " + String.format("%.2f",getArea());
    }
}
