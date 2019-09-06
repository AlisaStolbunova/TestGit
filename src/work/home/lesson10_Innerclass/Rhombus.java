package work.home.lesson10_Innerclass;

public class Rhombus implements Shape {
    private double a;
    private double angle;

    public Rhombus(double a, double angle) {
        this.a = a;
        this.angle = angle;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public double getArea() {
        return Math.pow(a,2) * Math.sin(Math.toRadians(30));
    }

    @Override
    public String toString() {
        return "Rhombus " +
                "a = " + a +
                ", Perimeter = " + String.format("%.2f", getPerimeter()) +
                ", Area = " + String.format("%.2f", getArea());
    }
}
