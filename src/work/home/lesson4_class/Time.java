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
        //if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60)
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
            this.minute = minute;
            if (second >= 60) {
                this.minute += second / 60;
                this.second = second % 60;
            } else {
                this.second = second;
            }
            if (this.minute >= 60) {
                {
                    this.hour += this.minute / 60;
                    this.minute = this.minute % 60;
                }
            }
        }
    }


    public Time(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else if (second >= 60) {
            minute = second / 60;
            this.second = second % 60;
            if (minute >= 60) {
                hour = minute / 60;
                minute = minute % 60;
            }
        }
    }


    public void printTime() {
        System.out.println("Time: " + hour + "h " + minute + "min " + second + "s");
    }

    public int printTimeSecond() {
        return hour * 3600 + minute * 60 + second;
    }


}
