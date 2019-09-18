package work.home.lesson14_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы
 */

public class FindWord {
    static void findWord() {
        String str = null;
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/alisa/Desktop/Courses/text1.rtf"))) {
            while ((str = br.readLine()) != null) {
                startVowel(str);
                letterLastFirst(str);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void startVowel(String str) {
        Pattern pattern = Pattern.compile("[aeiou][a-z]*");
        Matcher matcher;
        String[] array = str.toLowerCase().split(" ");
        for (int i = 0; i < array.length; i++) {
            if (pattern.matcher(array[i]).matches())
                System.out.print(array[i] + " " + "\n");
        }
    }

    /*
    Задан файл с текстом, найти и вывести в консоль все слова, для которых
    последняя буква одного слова совпадает с первой буквой следующего слова
     */

    static void letterLastFirst(String str) {
        String[] array = str.toLowerCase().split(" ");
        for (int i = 1; i <= array.length - 1; i++) {
            if ( array[i - 1].charAt(array[i - 1].length() - 1) == array[i].charAt(0))
                System.out.print(array[i - 1] + " " + array[i] + "\n");
        }
    }


}
