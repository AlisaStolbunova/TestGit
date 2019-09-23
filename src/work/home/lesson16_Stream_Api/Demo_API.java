package work.home.lesson16_Stream_Api;

import java.util.*;
import java.util.stream.Collectors;

public class Demo_API {
    public static void main(String[] args) {

        //Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5

        List<Integer> list = Arrays.asList(2, 4, 5, 7, 1, 9, 7, 15, 20);

        Double average = list.stream().filter((n) -> n % 2 == 1 &&  n % 5 == 0)
                .mapToInt((n) -> n)
                .average().getAsDouble();
        System.out.println(average);

        //Дан список строк. Найти количество уникальных строк длиной более 8 символов

        List<String> string = Arrays.asList("unique", "string", "eight", "polynomial", "more then eight", "Polynomial");

        long count = string.stream().filter(s -> s.length() > 8)
                .map(s -> s.toLowerCase())
                .distinct().count();
        System.out.println(count);

     //   Дана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов

        Map<String, Integer> map = new HashMap<String, Integer>(){{
            put("unique", 5);
            put("string", 2);
            put("eight", -1);
            put("polynomial", 7);
        }};

        map.forEach((k,v)-> System.out.println("key " + k + ", value " + v));
        int sum = map.entrySet().stream().filter((k)->k.getKey().length() < 7)
                .mapToInt((v) -> v.getValue())
                .sum();
        System.out.println(sum);

        //Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел

        String join = list.stream().map((n) -> n.toString())
                .collect(Collectors.joining());
        System.out.println(join);

        /*
        Дан класс Person с полями firstName, lastName, age. Вывести полное имя самого старшего человека,
        у которого длина этого имени не превышает 15 символов
         */

        List<Person> person = Arrays.asList(new Person("Ivan", "Ivanov", 27),
                new Person("Petr","Petrov", 13),
                new Person ("Fedor", "Fedorenko", 50),
                new Person("Lina", "Akimova", 18));

        System.out.println(person.stream()
                .filter((p) -> (p.getFirstName().length() + p.getLastName().length()) < 15)
                .max(Comparator.comparing((p) -> p.getAge())).get());


    }


//    static boolean getOdd(int n) {
//        return n%2 == 1;
//    }
//
//    static Predicate<Integer> filter(){
//        return n -> n%2 == 1;
//    }


}
