package work.home.lesson4_class;


/*
Создать класс, описывающий промежуток времени. Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами.
Создать метод для получения полного количества секунд в объекте
Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды по отдельности.
Создать метод для вывода данных.
Написать программу для тестирования возможностей класса.
 */

public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public Time(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        }
    }

    public void printTime() {
        System.out.println("Time: " + hour + "h " + minute + "min " + second + "s");
    }

    public int printTimeSecond() {
        return hour * 3600 + minute * 60 + second;
    }


}
