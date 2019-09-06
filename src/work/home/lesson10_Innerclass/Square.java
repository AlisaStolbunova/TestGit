package work.home.lesson10_Innerclass;

public class Square implements Shape, Diagonal {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public double getArea() {
        return Math.pow(a, 2);
    }


    @Override
    public String toString() {
        return "Square " +
                "a = " + a +
                ", Perimeter = " + String.format("%.2f", getPerimeter()) +
                ", Area = " + String.format("%.2f", getArea()) +
                ", diagonal = " + String.format("%.2f", getDiagonal(a, a));
    }
}
