package work.home.lesson14_IO;

import java.io.*;

/*
Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно
 */

public class Demo_IO {
    public static void main(String[] args) {
        String str = null;
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/alisa/Desktop/Courses/text1.txt"))) {
            while ((str = br.readLine()) != null) {
//                System.out.println(str); //Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно
                FindWord.startVowel(str);
                FindWord.letterLastFirst(str);
                DigitalSequence.maxDigitalSequence(str);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        BinaryFile.writeFile();
        BinaryFile.readFile();
        Reverse.reverse("/Users/alisa/IdeaProjects/TestGit/src/work/home/lesson14_IO/Order.java");
    }

}

