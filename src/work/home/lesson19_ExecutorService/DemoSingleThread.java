package work.home.lesson19_ExecutorService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Написать программу, бесконечно считывающую пользовательские числа из консоли. Эти числа представляют собой количество секунд.
При каждом вводе числа, должна создаваться задача, которая засыпает на введённое число секунд и затем выводит "Я спал N секунд".
Однако нужно сделать так, чтобы все задачи выполнялись в одном и том же потоке в порядке ввода.
Т.е. в программе есть 2 потока: главный и поток для выполнения всех задач по очереди.
При вводе -1 программа должна завершать свою работу.
 */

public class DemoSingleThread {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Input number ");
                String str = br.readLine();
                if ("-1".equals(str)) {
                    break;
                } else {
                    int n = Integer.parseInt(str);
                    service.submit(() -> {
                        try {
                            Thread.sleep(1000 * Integer.parseInt(str));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
//                        System.out.printf("My name is %s \n", Thread.currentThread().getName());
                        System.out.printf("I slept %d seconds \n", Integer.parseInt(str));
                    });
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (NumberFormatException ex) {
            System.out.println("Wrong number");
        }
        service.shutdown();
    }
}
