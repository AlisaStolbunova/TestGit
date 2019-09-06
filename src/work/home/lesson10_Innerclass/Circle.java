package work.home.lesson10_Innerclass;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public String toString() {
        return "Circle " +
                "r = " + r +
                ", Long = " + String.format("%.2f", getPerimeter()) +
                ", Area = " + String.format("%.2f", getArea());
    }

    public class CentralAngle {
        private double l;

        public CentralAngle(double l) {
            if(l <= getPerimeter()){
                this.l = l;
            }
        }

        public double getCentralAngle() {
            return (180 * l) / (Math.PI * r);
        }

        @Override
        public String toString() {
            return "CentralAngle = " + String.format("%.2f", getCentralAngle()) +
                    " for l = " + l;
        }
    }
}
