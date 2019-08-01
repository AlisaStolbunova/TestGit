import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // compareString();
        // choiceCase();
        choiceCaseSwitch();
    }



/*1. Запросить у пользователя 2 слова. Если они одинаковывы вести "Отлично! Слова одинаковы".Если они отличаются лишь регистром
-"Хорошо. Почти одинаковы" Если они отличаются, но одной длины -"Ну, хотя бы они одной длины" ИспользоватьметодыклассаString:
equals(String,string), equalsIgnoreCase(String string), length().*/

    public static void compareString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = sc.next();
        System.out.println("Введите вторую строку: ");
        String str2 = sc.next();
        sc.close();

        if (str1.equals(str2)) {
            System.out.println("Отлично! Слова одинаковы");
        } else if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Хорошо. Почти одинаковы");
        } else if (str1.length() == str2.length()) {
            System.out.println("Ну, хотя бы они одной длины");
        }
    }


    /*2. Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
    Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля").
    a. Использовать конструкцию if-else.
    b. Модифицировать в switch в отдельном файле*/

    public static void choiceCase() {
        String str;
        int number;
        boolean flag = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        while (flag) {
            str = sc.next();
            if (str.equals("exit")) {
                flag = false;
                break;
            }
            number = Integer.parseInt(str);

            if (((number % 100) / 10) == 1) {
                System.out.println(number + " рублей");
            } else if ((number % 10 == 1)) {
                System.out.println(number + " рубль");
            } else if ((number % 10) > 1 && (number % 10) < 5) {
                System.out.println(number + " рубля");
            } else {
                System.out.println(number + " рублей");
            }
        }

        sc.close();
    }

    public static void choiceCaseSwitch() {
        String str;
        int number;
        boolean flag = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        while (flag) {
            str = sc.next();
            if (str.equals("exit")) {
                flag = false;
                break;
            }
            number = Integer.parseInt(str);

            if (number % 100 >= 11 && number % 100 <= 14) {
                System.out.println(number + " рублей");

            } else {
                switch (number % 10) {
                    case 1:
                        System.out.println(number + " рубль");
                        break;
                    case 2:
                    case 3:
                    case 4:
                        System.out.println(number + " рубля");
                        break;
                    default:
                        System.out.println(number + " рублей");
                        break;
                }
            }
        }

        sc.close();
    }


}



