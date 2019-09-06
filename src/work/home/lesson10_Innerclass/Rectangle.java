package work.home.lesson10_Innerclass;

public class Rectangle implements Shape, Diagonal {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle " +
                "a = " + a +
                ", b = " + b +
                ", Perimeter = " + String.format("%.2f", getPerimeter()) +
                ", Area = " + String.format("%.2f", getArea()) +
                ", diagonal = " + String.format("%.2f", getDiagonal(a,b));
    }
}
