package work.home.lesson8_shape;

public class Circle extends Shape {
    public double r;
    public final double pi = 3.14;

    @Override
    public double perimeter() {
        return 2 * pi * r;
    }

    @Override
    public double area() {
        return pi * Math.pow(r,2) ;
    }
}
