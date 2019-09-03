package work.home.lesson9_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexpr {

   /* Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
    В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний, при этом оно
    должно начинаться с буквы. Возможные домены верхнего уровня: .org .com*/

    public static  boolean validMail(String str){
        String[] array = str.split("\\.");
        if("org".equals(array[1]) || "com".equals(array[1])){
            Pattern pattern = Pattern.compile("^([(A-Za-z])\\w*_*@[a-z]+");
            Matcher matcher = pattern.matcher(array[0]);
            return matcher.matches();
        }
        else
            return false;
    }






    public static void main(String[] args) {
        String str = "Alisa_st@gmail.com";
        System.out.println(validMail(str));
    }


}
