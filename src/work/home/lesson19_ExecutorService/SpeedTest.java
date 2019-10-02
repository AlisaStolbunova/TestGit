package work.home.lesson19_ExecutorService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/*
Задан массив случайных целых чисел (от 1 до 300) случайной длины (1 млн элементов).
Найти максимальный элемент в массиве двумя способами: в одном потоке и используя 10 потоков.
Сравнить затраченное в обоих случаях время
 */

public class SpeedTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int length = (int) (Math.random() * 1_000_000 + 1);
        System.out.println("Length: " + length);
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 300 + 1);
        }

        for (int i = 0; i < 1000; i++) {

            long start = System.nanoTime();
            getMaxOneThread(array);
            System.out.println("Time one thread = " + (System.nanoTime() - start));

            start = System.nanoTime();
            getMaxTenThreads(array);
            System.out.println("Time ten thread = " + (System.nanoTime() - start));
        }

    }

    static void getMaxOneThread(int[] array) {
        Arrays.stream(array).max().ifPresent(System.out::println);
    }

    static void getMaxTenThreads(int[] array) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        List<Future<Integer>> list = new ArrayList<>(10);
        int delimiter = 10;
        int step = array.length / delimiter;
        int from = 0;
        while (delimiter > 0) {
            delimiter--;
            int to = array.length - (step * delimiter);
            int[] subArray = Arrays.copyOfRange(array, from, to);
            from = to;
            list.add(service.submit(() -> Arrays.stream(subArray).max().getAsInt()));
        }
        service.shutdown();


        int max = 0;
        for (Future<Integer> future : list) {
            Integer futureInt = future.get();
            if (max < futureInt) {
                max = futureInt;
            }
        }

        System.out.println(max);
    }


}

