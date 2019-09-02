package work.home.lesson8_String;

public class TenNumbers {
    double start;


    public String concat(long num) {
        String s = "";
        String str = String.valueOf(num);
        if (str.length() > 10) {
            str = "0000000000";
        } else {
            start = System.nanoTime();
            if (str.length() < 10) {
                int count = 10 - str.length();
                for (int i = 0; i < count; i++) {
                    s = s.concat("0");
                }
                s = s.concat(str);
                System.out.println("Time concat " + (System.nanoTime() - start));
                return s;
            }

        }
        return str;
    }

    public String numArray(long num) {
        String str = String.valueOf(num);
        char[] array = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0'};
        if (str.length() > 10) {
            str = "0000000000";
        } else {
            start = System.nanoTime();
            if (str.length() < 10) {
                int count = 10 - str.length();
                char[] ar = str.toCharArray();
                for (int i = count, j = 0; i < array.length; i++, j++) {
                    array[i] = ar[j];
                }
                System.out.println("Time array " + (System.nanoTime() - start));

                return String.valueOf(array);
            }
        }
        return str;
    }

    public String format(long num){
        String str = String.valueOf(num);
        if (str.length() > 10) {
            str = "0000000000";
        } else {
            if(str.length() < 10){
                str = String.format("%010d%n", num);
            }
        }
        return str;
    }
}
