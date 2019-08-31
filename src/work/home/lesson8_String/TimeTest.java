package work.home.lesson8_String;

/*Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
 второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.*/

public class TimeTest {

    public static long timePlus() {
        String str = "";

        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            str += String.valueOf(i);
        }
        long end = System.nanoTime();

        return (end - start) / 1000;
    }

    public static long timeConcat() {
        String str = "";

        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            str = str.concat(String.valueOf(i));
        }
        long end = System.nanoTime();

        return (end - start) / 1000;
    }

    public static long timeBuilder() {
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sb.append(String.valueOf(i));
        }
        long end = System.nanoTime();

        return (end - start) / 1000;
    }

}
