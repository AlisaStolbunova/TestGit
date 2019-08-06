package work.home.lesson4_class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Time

        Time time = new Time(135);
        Time time1 = new Time(12, 32,11);
        time1.printTime();
        time.printTimeSecond();
        time1.printTimeSecond();

        System.out.println();


        // ATM

        ATM atm = new ATM(10,50,100);

        int count10;
        int count50;
        int count100;
        int sum;
        int allMoney;

        System.out.println("Добавляем деньги в банкомат");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество купюр номиналом 10: ");
        count10 = sc.nextInt();
        System.out.println("Введите количество купюр номиналом 50: ");
        count50 = sc.nextInt();
        System.out.println("Введите количество купюр номиналом 100: ");
        count100 = sc.nextInt();

        allMoney = atm.addMoney(count10, count50,count100);

        System.out.println("Какую сумму выдать?");
        sum = sc.nextInt();
        atm.moneyRequest(allMoney, sum, count10, count50, count100);

        sc.close();
    }
}
