package work.home.lesson15_IO_Serialization;

import java.io.Serializable;

/*
Создать класс Computer. Добавить ему несколько полей, создать объект этого класса, сериализовать в файл.
Десериализовать объект из того же файла, вывести значения полей в консоль.
 */

public class Computer implements Serializable {
    private static final long serialVersionUID = -6319397889610791795L;
    private String name;
    private String processor;
    private int HDD;
    private String videoCard;
    private String soundCard;

    public Computer(String name, String processor, int HDD, String videoCard) {
        this.name = name;
        this.processor = processor;
        this.HDD = HDD;
        this.videoCard = videoCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", processor='" + processor + '\'' +
                ", HDD=" + HDD +
                ", videoCard='" + videoCard + '\'' +
                 '}' + "\n";
    }
}
