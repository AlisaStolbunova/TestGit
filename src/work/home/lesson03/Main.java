package work.home.lesson03;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printStrBack();
        /*naturalNumberArray();
        arraySum();
        arrayThreeNumber();
        butterflyArray();
        twoArrayEquals();
        printRandomCard();
        listOfCards();
        simpleNumber();
        forFactorial();
        whileFactorial();*/

    }

    public static int[] createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array size: ");
        int size = sc.nextInt();
        sc.close();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }

        printArray(array);
        System.out.println();

        return array;
    }


    /* 1. Напишите программу, которая печатает массив сначала в обычном порядке, затем в обратном. */
    public static void printStrBack() {
        int[] array;
        array = createArray();
        System.out.println("Straight array: ");
        printArray(array);
        System.out.println("Backward array: ");
        printBackward(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printBackward(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /* 2. Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его.*/

    public static void naturalNumberArray() {
        int[] array = new int[100];
        int y = 0;
        for (int i = 13; y < 100; i++) {
            if (i % 13 == 0 || i % 17 == 0) {
                array[y] = i;
                y++;
            }
        }
        printArray(array);
    }

    /* 3. Определить сумму элементов целочисленного массива, расположенных между ближайшими минимальным и максимальным значениями,
    не включая минимальное и максимальное значение */

    public static void arraySum() {
        int[] array = createArray();
        //int[] array = {0, 1, 5, 9, 7, 9, 0, 4, 3, 1, 9, 0};

        int sum = 0;
        int min = minArray(array);
        System.out.println("min = " + min);
        int max = maxArray(array);
        System.out.println("max = " + max);

        boolean flagMax;
        int SUM = 0;
        for (int i = 0; i < array.length; i++) {
            flagMax = false;
            sum = 0;
            if (array[i] == min) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] == max) {
                        flagMax = true;
                    }
                    if (array[j] == min || array[j] == max) {
                        break;
                    }
                    sum += array[j];
                }
            }
            if (flagMax) {
                SUM += sum;
            }
        }

        System.out.println("Sum = " + SUM);
    }


    public static int maxArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = max < array[i] ? array[i] : max;
        }
        return max;
    }

    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = min > array[i] ? array[i] : min;
        }
        return min;
    }


    /* 4. Создать массив из 3 случайных целых чисел из отрезка [10;99], вывести его на экран в строку.
    Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью */

    public static void arrayThreeNumber() {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90 + 10);
        }
        printArray(array);

        int flag = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                flag++;
            }
            if (flag == array.length - 1) {
                System.out.println("Массив является строго возрастающей последовательностью");
            }
        }
    }

    /* 5. Создать двухмерный квадратный массив, и заполнить его "бабочкой", т.е. таким образом:
    1 1 1 1 1
    0 1 1 1 0
    0 0 1 0 0
    0 1 1 1 0
    1 1 1 1 1
    Вывести его на экран, заменив 1 символом *, а 0 - пробелом */

    public static void butterflyArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = sc.nextInt();
        sc.close();
        char[][] array = new char[size][size];

        for (int i = 0; i < array.length / 2; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j >= i) && (j <= (array[i].length - 1 - i))) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        for (int i = array.length - 1; i >= array.length / 2; i--) {
            for (int j = 0; j < array.length; j++) {
                if (j > i || j < array.length - 1 - i) {
                    array[i][j] = ' ';
                } else {
                    array[i][j] = '*';
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }

    /* 6. Написать метод equals, который определяет, равны ли между собой соответствующие элементы 2-хдвумерных массивов.*/

    public static int[][] twoArrayGeneration() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int size1 = sc.nextInt();
        System.out.print("Введите количество столбцов: ");
        int size2 = sc.nextInt();
        // sc.close();
        int[][] array = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        return array;
    }

    public static void twoArrayPrint(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void twoArrayEquals() {
        int[][] array1 = twoArrayGeneration();
        twoArrayPrint(array1);
        int[][] array2 = twoArrayGeneration();
        twoArrayPrint(array2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку и столбец для сравнения: ");
        int str = sc.nextInt();
        int column = sc.nextInt();
        sc.close();
        if (array1[str][column] == array2[str][column]) {
            System.out.println("Элементы равны");
        } else {
            System.out.println("Элементы не равны");
        }
    }


    /* 7. Написать программу, эмулирующую выдачу случайной карты из колоды в 52 карты. Вывести результат в формате "КартаofМасть". Например,
    "AceofSpades".
    Валет -Jack, Дама-Queen, Король-King, Туз-Ace, Червы-Hearts, Пики-Spades, Трефы-Clubs, Бубны-Diamonds */

    public static void printRandomCard() {
        String card = shuffleCard(deckOfCards());
        System.out.println("Случайная карта: " + card);
    }

    public static String[][] deckOfCards() {
        String[][] deck = {
                {"2 of Heart", "2 of Spades", "2 of Clubs", "2 of Diamonds"},
                {"3 of Heart", "3 of Spades", "3 of Clubs", "3 of Diamonds"},
                {"4 of Heart", "4 of Spades", "4 of Clubs", "4 of Diamonds"},
                {"5 of Heart", "5 of Spades", "5 of Clubs", "5 of Diamonds"},
                {"6 of Heart", "6 of Spades", "6 of Clubs", "6 of Diamonds"},
                {"7 of Heart", "7 of Spades", "7 of Clubs", "7 of Diamonds"},
                {"8 of Heart", "8 of Spades", "8 of Clubs", "8 of Diamonds"},
                {"9 of Heart", "9 of Spades", "9 of Clubs", "9 of Diamonds"},
                {"10 of Heart", "10 of Spades", "10 of Clubs", "10 of Diamonds"},
                {"Jack of Heart", "Jack of Spades", "Jack of Clubs", "Jack of Diamonds"},
                {"Queen of Heart", "Queen of Spades", "Queen of Clubs", "Queen of Diamonds"},
                {"King of Heart", "King of Spades", "King of Clubs", "King of Diamonds"},
                {"Ace of Heart", "Ace of Spades", "Ace of Clubs", "Ace of Diamonds"},
        };
        return deck;
    }

    public static String shuffleCard(String array[][]) {

        return (array[(int) (Math.random() * 13)][(int) (Math.random() * 4)]);

    }

    /* 8* Написать программу, перемешивающую и печатающую список карт в колоде. Воспользоваться результатом предыдущей задачи. */

    public static void listOfCards() {

        String[][] array = deckOfCards();
        int count = 0;
        String card;
        boolean flag = false;

        while (count < 52) {
            card = shuffleCard(array);
            if (card.equals("0")) {
                continue;
            } else {
                System.out.println(card);
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (array[i][j].equals(card)) {
                            array[i][j] = "0";
                            count++;
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        flag = false;
                        break;
                    }
                }
            }
        }
    }

    /* 9. Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.*/
    public static void simpleNumber() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String str;
        int num;
        int count;
        System.out.println("Input number: ");
        while (flag) {
            count = 0;
            str = sc.next();
            if (str.equals("exit")) {
                flag = false;
                break;
            }
            num = Integer.parseInt(str);
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println("Number is simple");
            } else {
                System.out.println("Number is not simple");
            }
        }
        sc.close();
    }

    /* Написать алгоритм расчета факториала , используя циклы (for и while) */

    public static void forFactorial() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String str;
        int num;
        long f;
        System.out.println("Input number: ");
        while (flag) {
            f = 1;
            str = sc.next();
            if (str.equals("exit")) {
                flag = false;
                break;
            }
            num = Integer.parseInt(str);
            for (int i = 1; i <= num; i++) {
                f *= i;
            }
            System.out.println("!" + num + " = " + f);
        }
        sc.close();
    }

    public static void whileFactorial() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String str;
        int num, i;
        long f;
        System.out.println("Input number: ");
        while (flag) {
            f = 1;
            i = 1;
            str = sc.next();
            if (str.equals("exit")) {
                flag = false;
                break;
            }
            num = Integer.parseInt(str);
            while (i <= num) {
                f *= i;
                i++;
            }
            System.out.println("!" + num + " = " + f);
        }
        sc.close();
    }


}


