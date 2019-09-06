package work.home.lesson10_Innerclass;

public interface Diagonal {
    default double getDiagonal(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
}
