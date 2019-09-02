package work.home.lesson8_String;

/* Написать функцию, принимающую на вход целое число, возвращающую строку из 10 символов, дополненных слева нулями.
   Если число выходит за размер 10 символов вернуть все нули.
   Пример getString(22) -> 0000000022
   Найти 3 способа решения задачи и определить наиболее быстрый способ.*/

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
                System.out.println("Time concat " + (System.nanoTime() - start) / 1000 + "ms");
                return s;
            }

        }
        return str;
    }

    public String stringBuilder(long num) {
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(num);
        if (str.length() > 10) {
            str = "0000000000";
        } else {
            start = System.nanoTime();
            if (str.length() < 10) {
                int count = 10 - str.length();
                for (int i = 0; i < count; i++) {
                    sb.append(0);
                }
                sb.append(str);
                System.out.println("Time StringBuilder " + (System.nanoTime() - start) / 1000 + "ms");
                return sb.toString();
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
                System.out.println("Time array " + (System.nanoTime() - start) / 1000 + "ms");

                return String.valueOf(array);
            }
        }
        return str;
    }

    public String format(long num) {
        String str = String.valueOf(num);
        if (str.length() > 10) {
            str = "0000000000";
        } else {
            start = System.nanoTime();
            if (str.length() < 10) {
                str = String.format("%010d%n", num);
                System.out.println("Time format " + (System.nanoTime() - start) / 1000 + "ms");
            }
        }
        return str;
    }
}
