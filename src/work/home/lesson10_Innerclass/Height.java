package work.home.lesson10_Innerclass;

public interface Height {
    default double getHeight(double a, double b, double c) {
        return (Math.sqrt(2 * (Math.pow(a,2) + Math.pow(b,2)) - Math.pow(c,2)))/2;
    }
}
