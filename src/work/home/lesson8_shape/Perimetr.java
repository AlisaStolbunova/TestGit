package work.home.lesson8_shape;

public interface Perimetr {

    default double perimeter(double a, double b) {
        return 2 * a + 2 * b;
    }
}
