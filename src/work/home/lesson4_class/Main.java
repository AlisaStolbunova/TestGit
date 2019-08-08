package work.home.lesson4_class;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Time

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select task: \n1. Time \n2. ATM \n3. exit");
            String select = sc.next();
            if (select.equals("3")) {
                break;
            }

            if (select.equals("1")) {
                int h, m, s;

                System.out.println("Input time in seconds: ");

                Time time = new Time(sc.nextInt());
                time.printTime();

                System.out.println("Input h: ");
                h = sc.nextInt();
                System.out.println("Input min: ");
                m = sc.nextInt();
                System.out.println("Input sec: ");
                s = sc.nextInt();
                time = new Time(h, m, s);
                time.printTime();
                System.out.println("in seconds:" + time.printTimeSecond());
            }

            if (select.equals("2")) {
                // ATM

                ATM atm = new ATM(0, 0, 0);

                int count20;
                int count50;
                int count100;
                int sum;
                int allMoney;

                while (true) {
                    System.out.println("Select operation: \n1.Add money \n2.Withdraw money \n3.exit");
                    select = sc.next();
                    if (select.equals("1")) {
                        System.out.println("Input number note of 20: ");
                        count20 = sc.nextInt();
                        atm.add20s(count20);
                        System.out.println("Input number note of 50: ");
                        count50 = sc.nextInt();
                        atm.add50s(count50);
                        System.out.println("Input number note of 100: ");
                        count100 = sc.nextInt();
                        atm.add100s(count100);
                    }
                    if (select.equals("2")) {
                        System.out.println("Input sum for withdraw money:");
                        sum = sc.nextInt();
                        atm.withdrawMoney(sum);
                        atm.printBalance();
                    }

                    if (select.equals("3")) {
                        break;
                    }

                }
            }
        }
        sc.close();
    }
}