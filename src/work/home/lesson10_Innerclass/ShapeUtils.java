package work.home.lesson10_Innerclass;

public class ShapeUtils {
    public static boolean isRectangle(Shape shape){
        return shape instanceof Rectangle;
    }

    public static boolean isTriangle(Shape shape){
        return shape instanceof Triangle;
    }
}
