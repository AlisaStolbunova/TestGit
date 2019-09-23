package work.home.lesson15_IO_Serialization;

/*
Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad - также созданного класса со своими полями.
Добавить в класс Notebook transient - поле. Создать объект класса Notebook, сериализовать в файл.
Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.
 */

public class Notebook extends Computer{

    private static final long serialVersionUID = 5536174050459978959L;
    private Touchpad t;
    private transient double diagonal;

    public Notebook(String name, String processor, int HDD, String videoCard, Touchpad t, double diagonal) {
        super(name, processor, HDD, videoCard);
        this.t = t;
        this.diagonal = diagonal;
    }

    public Touchpad getT() {
        return t;
    }

    public void setT(Touchpad t) {
        this.t = t;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + getName() + '\'' +
                ", processor='" + getProcessor() + '\'' +
                ", HDD=" + getHDD() +
                ", videoCard='" + getVideoCard() + '\'' +
                ", Touchpad=" + t +
                ", diagonal=" + diagonal +
                '}';
    }
}
