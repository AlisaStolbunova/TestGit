package work.home.lesson10_Innerclass;

public class DemoShape {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2,3);
        System.out.println(rectangle);

        Circle circle = new Circle(5);
        System.out.println(circle);
        Circle.CentralAngle angle = circle.new CentralAngle(10);
        System.out.println(angle);

        Shape triangle = new Triangle(2,2,3);
        System.out.println(triangle);

        Shape square = new Square(3);
        System.out.println(square);

        Shape ellipse = new Ellipse(2,3);
        System.out.println(ellipse);

        Shape rhombus = new Rhombus(3,30);
        System.out.println(rhombus);

        Shape rectangle1 = new Triangle(3,4,6);
        System.out.println(ShapeUtils.isRectangle(rectangle1));
        System.out.println(ShapeUtils.isRectangle(rectangle));
        System.out.println(ShapeUtils.isTriangle(rectangle));

        System.out.println(rectangle.equalsArea(rhombus));


    }
}
