package work.home.lesson11_Exception;

import java.util.SortedMap;

public class MyRTException extends RuntimeException {
    public MyRTException(String message) {
        super(message);
    }


    /*Бросить одно из существующих в JDK исключений, отловить его и
      выбросить своё собственное, указав в качестве причины отловленное */

    public MyRTException(String message, Throwable cause) {
        super(message, cause);
    }

    public static void division(int a, int b) {
        try {
            try {
                System.out.println(a / b);
            } catch (ArithmeticException ex) {
                throw new MyRTException("My exception", ex);
            }
        } catch (MyRTException ex) {
            ex.printStackTrace();
        }
    }
}
