package work.home.lesson8_shape;

public class Square extends Shape implements Perimetr, Area {
    public double a;
    public double b;

    public Square(double x, double y, double a, double b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return perimeter(a,b);
    }

    @Override
    public double getArea() {
        return area(a,b);
    }
}