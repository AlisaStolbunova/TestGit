package work.home.lesson15_IO_Serialization;

import java.io.*;
import java.util.Date;

/*
Сравнить скорость чтения и записи 5 МБ символов при использовании классов
буфиризированого и не буфиризированого символьного ввода вывода
 */

public class TestRW {
    static void readWrite(String rFile, String wFile) {
        try (FileReader fr = new FileReader(rFile);
             FileWriter fw = new FileWriter(wFile)) {
            int ch;
            while ((ch = fr.read()) > 0) {
                fw.write((char) ch);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void bufReadWrite(String rFile, String wFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(rFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(wFile))) {
            int ch;
            while ((ch = br.read()) > 0){
                bw.write((char)ch);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void test(){
        for(int i = 0; i < 1000; i++) {
            Date time = new Date();
            readWrite("/Users/alisa/Desktop/Courses/text2.txt", "/Users/alisa/Desktop/Courses/wfile.txt");
            System.out.println("Time1 = " + time.getTime());

            Date time1 = new Date();
            bufReadWrite("/Users/alisa/Desktop/Courses/text2.txt", "/Users/alisa/Desktop/Courses/wfile.txt");
            System.out.println("Time2 = " + time1.getTime());
        }
    }
}
