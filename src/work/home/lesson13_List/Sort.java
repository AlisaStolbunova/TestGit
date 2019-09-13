package work.home.lesson13_List;

import java.util.List;
import java.util.ListIterator;

/*Использовать Алгоритмы. Не используя вспомогательных объектов, переставить отрицательные элементы сгенерированного списка в конец,
а положительные – в начало этого списка*/

public class Sort {
    ListIterator iterator;

    void fillList(List<Integer> list) {
        iterator = list.listIterator();
        for (int i = 0; i < 10; i++) {
            iterator.add(-10 + (int) (Math.random() * 20 + 1));
        }
        printList(list);
    }

    void printList(List<Integer> list) {
        iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    void sort(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) < 0) {
                list.add(list.get(i));
            }
        }

        for (int i = 0; i < size; i++) {
            if (list.get(i) < 0) {
                list.remove(list.get(i));
                size--;
                i--;
            }
        }
        printList(list);


 /*       iterator = list.listIterator();
        int counter = list.size();
        Integer temp = 0;
        while (counter > 0 & iterator.hasNext()) {
            temp = (Integer) iterator.next();
            if (temp < 0) {
                list.add(temp);
                counter--;
            } else {
                counter--;
            }
        }
        printList(list);
    }*/
    }
}
