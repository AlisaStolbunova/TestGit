package work.home.lesson11_Exception;

/*Написать метод, который в 50% случаев бросает исключение.
Вызвать этот метод в конструкции try-catch-finally. Протестироватьработу блока finally
*/

public class FiftyPercentEx {
    public static boolean flag = true;
    public static int counter = 0;

    public static void test() {
        counter++;

        try {
            fiftyPercentThrow(flag);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            flag = !flag;
            System.out.println("Block finally: Change flag. flag = " + flag);
            if (counter < 4) {
                test();
            }
        }
    }

    public static void fiftyPercentThrow(boolean flag) throws ClassNotFoundException {
        if (flag) {
            throw new ClassNotFoundException();
        }
    }
}
