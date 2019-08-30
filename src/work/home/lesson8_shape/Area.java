package work.home.lesson8_shape;

public interface Area {
    default double area(double a, double b) {
        return a * b;
    }
}
