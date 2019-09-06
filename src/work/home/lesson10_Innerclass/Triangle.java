package work.home.lesson10_Innerclass;

public class Triangle implements Shape, Height {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "Triangle " +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", Perimeter = " + String.format("%.2f", getPerimeter()) +
                ", Area = " + String.format("%.2f", getArea()) +
                ". Height = " + String.format("%.2f", getHeight(a,b,c));
    }
}
