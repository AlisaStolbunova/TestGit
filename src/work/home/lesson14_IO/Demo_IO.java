package work.home.lesson14_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно
 */

public class Demo_IO {
    public static void main(String[] args) {
        String str = null;
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/alisa/Desktop/Courses/text1.txt"))) {
            while ((str = br.readLine()) != null) {
//                System.out.println(str);
//                FindWord.startVowel(str);
                FindWord.letterLastFirst(str);
                DigitalSequence.maxDigitalSequence(str);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
