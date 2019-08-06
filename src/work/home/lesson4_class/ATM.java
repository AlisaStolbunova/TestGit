package work.home.lesson4_class;

public class ATM {
    static int banknote10;
    static int banknote50;
    static int banknote100;

    public ATM(int banknote10, int banknote50, int banknote100) {
        this.banknote10 = banknote10;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public static int addMoney(int count10, int count50, int count100) {
        int allMoney = 0;
        allMoney = banknote10 * count10 + banknote50 * count50 + banknote100 * count100;
        System.out.println("All money: " + allMoney);
        return allMoney;
    }

    public static boolean moneyRequest(int allMoney, int sum, int count10, int count50, int count100) {
        if (sum < allMoney && sum % 10 == 0) {
            if (sum / 100 != 0) {
                if (sum / 100 < count100) {
                    System.out.print(sum / 100 + " купюрами номиналом 100, ");
                } else {
                    System.out.print(count100 * banknote100 + " купюрами номиналом 100, ");
                }
                sum -= (sum / 100 * banknote100);
            }
            if (sum != 0 && sum / 50 != 0) {
                if (sum / 50 < count50) {
                    System.out.print(sum / 50 + " купюрами номиналом 50, ");
                } else {
                    System.out.print(count50 * banknote50 + " купюрами номиналом 50, ");
                }
                sum -= (sum / 50 * banknote50);
            }
            if (sum != 0 && sum / 10 != 0 && sum / 10 < count10) {
                System.out.println(sum / 10 + " купюрами номиналом 10");
            }
            return true;
        } else
            return false;

    }
}



