package work.home.lesson14_IO;

import java.io.*;
/*
Записать в двоичный файл 20 случайных чисел типа int со значением больше 255. Прочитать записанный файл, распечатать числа и их среднее арифметическое
 */

public class BinaryFile {
    static void writeFile() {
        try (FileOutputStream fos = new FileOutputStream("/Users/alisa/Desktop/Courses/t1.txt")) {

            for (int i = 0; i < 20; i++) {
                int num = 256 + (int) (Math.random() * 245 + 1);
                System.out.print(num + " ");
                for (int j = 3; j >= 0; j--) {
                    fos.write((num >>> (8 * j)) & 0b11111111);
                }
            }
            System.out.println();

        } catch (
                IOException ex) {
            ex.printStackTrace();
        }

    }

    static void readFile() {
        try (FileInputStream fis = new FileInputStream("/Users/alisa/Desktop/Courses/t1.txt")) {
            int[] buf = new int[4];
            int count = 0;
            int sum = 0;

            while (fis.available() > 0) {
                for (int i = 0; i < 4; i++) {
                    buf[i] = fis.read();
                }
                int c = 0;
                for (int i = 0, j = 3; i < buf.length; i++) {
                    c += buf[i] << (8 * j);
                    j--;
                }
                System.out.print(c + " ");
                count++;
                sum += c;
            }
            System.out.println("\nAverage = " + (double) sum / count);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

