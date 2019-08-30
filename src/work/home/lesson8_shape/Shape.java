package work.home.lesson8_shape;

public abstract class Shape {
    double x;
    double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

}
