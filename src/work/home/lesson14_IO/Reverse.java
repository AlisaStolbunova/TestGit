package work.home.lesson14_IO;

import java.io.*;

/*
Задан файл с java - кодом. Прочитать текст программы из файла и записать в другой файл в обратном порядке символы каждой строки
 */

public class Reverse {
    static void reverse(String path){
        try(BufferedReader br = new BufferedReader(new FileReader(path));
            BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/alisa/Desktop/Courses/reverse.txt"))
        ){
            String str;
            while ((str = br.readLine()) != null){
                String revstr = new StringBuilder(str).reverse().toString();
                bw.write(revstr + "\n");
            }

        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

}
