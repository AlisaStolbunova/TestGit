package work.home.lesson5_wrappers;

import java.math.BigDecimal;

public class Arifm {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.pow(2,2));
        System.out.println(a.divide(5,2));
        System.out.println(a.abs(-8));
        BigDecimal a1 = new BigDecimal("11111111111111111111111111111111111111111111111111111111");
        BigDecimal a2 = new BigDecimal("11111111111111111111111111111111111111111111111111111111");
        BigDecimal a0 = new BigDecimal("-11111111111111111111111111111111111111111111111111111111");
        BigDecimal c = new BigDecimal("0");
        BigDecimal a3 = a.sum(a1, a2);
        //BigDecimal a4 = a.divide(a1, c);
        BigDecimal a5 = a.abs(a0);

        System.out.println(a5);
    }
}
