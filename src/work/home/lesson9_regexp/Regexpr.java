package work.home.lesson9_regexp;

import javax.crypto.spec.PSource;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexpr {

   /* Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
    В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний, при этом оно
    должно начинаться с буквы. Возможные домены верхнего уровня: .org .com*/

    public static boolean validMail(String str) {
        Pattern pattern = Pattern.compile("^[A-Za-z]\\w*_*@[a-z]*\\.(org|com)$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    /* Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java,
    с помощью регулярных выражений и выводящую их на страницу.*/

    public static void hexNumber(String str) {
        Pattern pattern = Pattern.compile("\\b0[Xx][A-Fa-f0-9]+\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }

    }

    /*
    Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметры,
    например <p id ="p1">, и замену их на простые теги абзацев <p>
     */
    public static void tegReplace(String str) {
        System.out.println(str.replaceAll("<p[\\s\\w\\=\\\"]+>","<p>"));

    }

    /*
    Написать программу, выполняющую поиск в строке мобильных телефонных номеров в формате +375XXYYYYYYY
    и заменяющую каждый телефон на тот же, но в формате +375 (XX)YYY-YY-YY
    X - код оператора
    Y - номер телефона */

    public static void phoneNumber(String str) {
        System.out.println(str.replaceAll("(\\+375)(\\d{2})(\\d{3})(\\d{2})(\\d{2}\\b)", "$1 ($2)$3-$4-$5"));
    }

    /*
    Написать метод, который проверяет, является ли строка адресом IPv4.
    Пример корректных IPv4
    0.0.0.0
    0.0.1.0
    255.0.0.1
    255.55.255.255
    192.168.0.1
    Не корректный
    001.0.0.0
    256.1.1.1
    1.1.1.1.
    -1.0.-1.1     */

    public static void validIP(String str) {
        Pattern pattern = Pattern.compile("[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}");
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            String[] s = str.split("\\.");
            int count = 0;
            for (int i = 0; i < s.length; i++) {
                if (Integer.parseInt(s[i]) >= 0 && Integer.parseInt(s[i]) < 256){
                    count++;}
            }
            System.out.println(count == 4 ? "Correct IP" : "Incorrect IP");
        }
        else{
            System.out.println("Incorrect IP");
        }
    }


    public static void main(String[] args) {
        String str = "Alisa_st@gmail.org";
        System.out.println(validMail(str));
        System.out.println("******************");
        str = "cat 0xFF dog 0XA5 xbb oCC 0xdw 0x111";
        hexNumber(str);
        System.out.println("******************");
        str = "<p id =\"p1\"> <p mvkdmvkd >";
        tegReplace(str);
        System.out.println("******************");
        str = "+375292626576 678 fgtth + 3754 +375443560742 +3752967789444";
        phoneNumber(str);
        System.out.println("******************");
        validIP("0.0.0.0");




    }


}
