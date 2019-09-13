package work.home.lesson13_List;

import java.util.List;
import java.util.ListIterator;

//Вывести учеников из списка в обратном порядке. (2 варианта решения)

public class Surname<T> {
    void reverseOrder1(List<T> report) {
        for (int i = report.size() - 1; i >= 0; i--) {
            System.out.print(report.get(i) + " ");
        }
        System.out.println();
    }

    void reverseOrder2(List<T> report) {
        ListIterator iterator = report.listIterator(report.size());
        while(iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();
    }

}
