package work.home.lesson9_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexpr {

   /* Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
    В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний, при этом оно
    должно начинаться с буквы. Возможные домены верхнего уровня: .org .com*/

    public static  boolean validMail(String str){
       Pattern pattern = Pattern.compile("^[A-Za-z]\\w*_*@[a-z]*\\.(org|com)$");
       Matcher matcher = pattern.matcher(str);
       return matcher.matches();
    }






    public static void main(String[] args) {
        String str = "Alisa_st@gmail.org";
        System.out.println(validMail(str));
    }


}
