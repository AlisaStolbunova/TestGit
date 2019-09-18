package work.home.lesson14_IO;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно
 */

public class ReadFile {
    static void readFile() {
        String str = null;
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/alisa/Desktop/Courses/text.rtf"))) {
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
