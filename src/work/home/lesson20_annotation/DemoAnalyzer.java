package work.home.lesson20_annotation;


/*
Создать класс - анализатор ClassAnalyzer. Класс имеет перегруженный метод analyze(),
принимающий объект типа Class или объект, отличный от него.
Реализовать методы, которые анализируют структуру класса на предмет полей, методов,
конструкторов и аннотаций всех типов для класса. Отчет выводится в консоль.
 */

public class DemoAnalyzer {
    public static void main(String[] args) {
        ClassAnalyzer.analize(work.home.lesson10_Innerclass.Rectangle.class);
    }
}
