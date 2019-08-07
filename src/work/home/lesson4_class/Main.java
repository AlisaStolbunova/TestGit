package work.home.lesson4_class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Time

        Scanner sc = new Scanner(System.in);
        int h, m, s;

        System.out.println("Input time in seconds: ");

        Time time = new Time(sc.nextInt());
        time.printTime();
        System.out.println("in seconds:" + time.printTimeSecond());


        System.out.println("Input h: ");
        h = sc.nextInt();
        System.out.println("Input min: ");
        m = sc.nextInt();
        System.out.println("Input sec: ");
        s = sc.nextInt();
        time = new Time(h, m, s);
        time.printTime();
        System.out.println("in seconds:" + time.printTimeSecond());

        // ATM

        ATM atm = new ATM(10, 50, 100);

        int count20;
        int count50;
        int count100;
        int sum;
        int allMoney;

        System.out.println("Добавляем деньги в банкомат");

        System.out.println("Введите количество купюр номиналом 20: ");
        count20 = sc.nextInt();
        atm.add20s(count20);
        System.out.println("Введите количество купюр номиналом 50: ");
        count50 = sc.nextInt();
        atm.add50s(count50);
        System.out.println("Введите количество купюр номиналом 100: ");
        count100 = sc.nextInt();
        atm.add100s(count100);

        System.out.println("Какую сумму выдать?");
        sum = sc.nextInt();
        atm.withdrawMoney(sum);


        sc.close();
    }
}
