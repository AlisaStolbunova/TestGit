package work.home.lesson11_Exception;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoException {


    public static void main(String[] args) {

        System.out.println("****************1********************");
        //NullPointerException
        String s = null;
        try {
            System.out.println(s.substring(2));
        } catch (NullPointerException e) {
            System.out.println("s = null!");
        }

        System.out.println("****************2********************");

        //ArrayIndexOutOfBoundsException
        int[] array = new int[10];

        try {
            for (int i = 0; i <= 10; i++) {
                array[i] = i;
                System.out.print(array[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nindex was outside the bounds of the array");
        }

        System.out.println("***************3*********************");

       Pancake.test(new Pancake());

        System.out.println("***************4*********************");

        try {
            System.out.println(parseInt("11s"));
        } catch (MyRTException ex) {
            ex.printStackTrace();
        }

        System.out.println("****************5********************");
        MyRTException.division(5,0);

        System.out.println("***************6*********************");
        RandomThrow.test();

        System.out.println("***************7*********************");
        FiftyPercentThrow.test();

    }

    public static int parseInt(String s) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches())
            return Integer.parseInt(s);
        else
            throw new MyRTException("Incorrect string");
    }


}
