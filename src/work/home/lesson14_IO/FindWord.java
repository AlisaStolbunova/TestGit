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
        Pattern pattern = Pattern.compile("[aeiou][a-z]*");
        Matcher matcher;
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/alisa/Desktop/Courses/text.rtf"))) {
            while ((str = br.readLine()) != null) {
                String[] array = str.toLowerCase().split(" ");
                for (int i = 0; i < array.length; i++) {
                    if (pattern.matcher(array[i]).matches())
                        System.out.println(array[i]);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
