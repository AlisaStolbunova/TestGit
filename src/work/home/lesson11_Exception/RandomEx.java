package work.home.lesson11_Exception;

/* Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
   Вызвать этот метод в блоке try -catch, отлавливающем любое из 3-х
*/


public class RandomEx {

    public static void randomThrow() throws ClassNotFoundException {
        int key = (int) ((Math.random() * 3) + 1);
        System.out.println("key = " + key);
        switch (key) {
            case 1: {
                throw new IllegalArgumentException();
            }
            case 2: {
                throw new ArithmeticException();
            }
            case 3: {
                throw new ClassNotFoundException();
            }
        }
    }

    public static void test() {

        try {
            randomThrow();
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
