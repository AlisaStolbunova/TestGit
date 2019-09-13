package work.home.lesson13_List;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.ListIterator;

/*
1.Создать список оценок учеников с помощью ListIterator,заполнить случайными оценками. Удалить неудовлетворительные оценки из списка
2. Создать список оценок учеников с помощью ListIterator,заполнить случайными оценками. Найти самую высокую оценку с использованием итератора
 */

class SchoolReport {
    ListIterator iterator;

    void fillList(List<Integer> report) {
        iterator = report.listIterator();
        for (int i = 0; i < 20; i++) {
            iterator.add((int) (Math.random() * 10 + 1));
        }
        printList(report);
    }

    void printList(List<Integer> report) {
        iterator = report.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    void deleteBadMark(List<Integer> report) {
        for (int i = 0; i < report.size(); i++) {
            if (report.get(i) < 4) {
                report.remove(i);
            }
        }
        printList(report);
    }

    void maxMark(List<Integer> report){
        iterator = report.listIterator();
        Integer max = report.get(0);
        Integer temp = 0;
        while (iterator.hasNext()){
            temp =(Integer) iterator.next();
            if(temp > max){
                max = temp;
            }
        }
        System.out.println("Max mark "  + max);
    }
}
