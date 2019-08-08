package work.home.lesson4_class;

public class ATM {
    static int banknote20;
    static int banknote50;
    static int banknote100;

    public ATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public void add20s(int count20) {
        banknote20 += count20;
    }

    public void add50s(int count50) {
        banknote50 += count50;
    }

    public void add100s(int count100) {
        banknote100 += count100;
    }

    public boolean withdrawMoney(int sum) {
        int amount = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;

        if (sum > amount) {
            System.out.println("Insufficient funds!");
            return false;
        }
        if (sum < 20 || sum % 10 != 0 || sum == 30) {
            System.out.println("Error");
            return false;
        }

        int temp = 0;
        int ost = 0;
        int kol20, kol50, kol100;
        kol20 = kol50 = kol100 = 0;

        kol20 = sum / 20;
        ost = sum % 20;
        if (ost != 0 && kol20 != 0) {
            while (ost != 50) {
                kol20--;
                ost = sum - kol20 * 20;
            }
            kol50++;
        }

        kol100 = kol20 * 20 / 100;
        kol20 = (kol20 * 20 % 100) / 20;
        if (kol100 > banknote100) {
            temp = (kol100 - banknote100) * 100;
            kol100 = banknote100;
        }
        kol50 += temp / 50;
        temp = 0;
        if (kol50 > banknote50) {
            temp = (kol50 - banknote50) * 50;
            if (temp % 20 != 0) {
                kol50--;
                temp += 50;
            } else {
                kol50 = banknote50;
            }
        }
        kol20 += temp / 20;
        if (kol20 > banknote20) {
            System.out.println("Error!!");
            return false;
        }

        banknote100 -= kol100;
        banknote50 -= kol50;
        banknote20 -= kol20;
        System.out.println(kol100 + " note of 100, " + kol50 + " note of 50, " + kol20 + " not of 20");
        return true;


    }

    public void printBalance() {
        System.out.println("100 осталось: " + banknote100);
        System.out.println("50 осталось: " + banknote50);
        System.out.println("20 осталось: " + banknote20);
    }

}



