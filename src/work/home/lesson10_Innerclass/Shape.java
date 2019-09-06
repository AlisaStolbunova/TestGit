package work.home.lesson10_Innerclass;

public interface Shape {
    double getPerimeter();

    double getArea();

    default boolean equalsArea(Shape shape){
        return getArea() == shape.getArea();
    }

}
