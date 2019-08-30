package work.home.lesson8_shape;

public class Circle extends Shape {
    public double r;
    public final double pi = 3.14;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * r;
    }

    @Override
    public double getArea() {
        return pi * Math.pow(r,2) ;
    }
}
