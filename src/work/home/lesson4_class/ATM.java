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
        if (sum > amount || sum % 100 != 0 && sum % 50 != 0 && sum % 20 != 0) {
            return false;
        } else {
            int sum100 = 0;
            int sum50 = 0;
            int sum20 = 0;
            if (banknote100 >= sum / 100) {
                sum100 = sum / 100;
                sum -= (sum100 * 100);
                amount -= (sum100 * 100);
            }
            if (amount >= sum && banknote50 >= sum50) {
                sum50 = sum / 50;
                sum -= (sum50 * 50);
                amount -= (sum50 * 50);
            }
            if (amount >= sum && banknote20 >= sum20) {
                sum20 = sum / 20;
                sum -= (sum20 * 20);
                amount -= (sum20 * 20);
            }

            if (sum == 0) {
                banknote100 -= sum100;
                banknote50 -= sum50;
                banknote20 -= sum20;
                System.out.println(sum100 + " купюрами номиналом 100, " + sum50 + " купюрами номиналом 50, " + sum20 + " купюрами номиналом 20");
                return true;
            } else return false;

        }
    }


}



