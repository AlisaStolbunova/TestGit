package work.home.lesson4_class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Time

        int h, m, s;

        System.out.println("Input time in seconds: ");
        Scanner sc = new Scanner(System.in);
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

        int count10;
        int count50;
        int count100;
        int sum;
        int allMoney;

        System.out.println("Добавляем деньги в банкомат");

        System.out.println("Введите количество купюр номиналом 10: ");
        count10 = sc.nextInt();
        System.out.println("Введите количество купюр номиналом 50: ");
        count50 = sc.nextInt();
        System.out.println("Введите количество купюр номиналом 100: ");
        count100 = sc.nextInt();

        allMoney = atm.addMoney(count10, count50, count100);

        System.out.println("Какую сумму выдать?");
        sum = sc.nextInt();
        atm.moneyRequest(allMoney, sum, count10, count50, count100);

        sc.close();
    }
}
