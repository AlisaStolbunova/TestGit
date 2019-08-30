package work.home.lesson8_shape;

public class Square extends Shape implements Perimetr, Area {
    public double a;
    public double b;

    @Override
    public double perimeter() {
        return perimeter(a,b);
    }

    @Override
    public double area() {
        return area(a,b);
    }
}
