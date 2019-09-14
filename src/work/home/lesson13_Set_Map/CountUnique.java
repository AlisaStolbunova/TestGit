package work.home.lesson13_Set_Map;

/*
Написать метод countUnique, который принимает целочисленный список в качестве параметра и возвращает количество уникальных
целых чисел в этом списке. При получении пустого списка метод должен возвращать 0.
 */

import java.util.*;

public class CountUnique {

    void fillList(List<Integer> list) {
        ListIterator iterator = list.listIterator();
        for (int i = 0; i < 20; i++) {
            iterator.add((int) (Math.random() * 10 + 1));
        }
        printList(list);
    }

    void printList(List<Integer> list) {
        list.forEach(i -> System.out.print(i + " "));
        System.out.println();

    }

    int countUnique(List<Integer> list) {
        if (list.size() == 0)
            return 0;
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        set.forEach(s -> System.out.print(s + " "));
       // System.out.println();
        return set.size();
    }

}
