package work.home.lesson13_List;

import java.util.HashSet;
import java.util.Set;

//Определить множество на основе множества целых чисел. Создать методы для определения пересечения и объединения множеств

class SetClass {
    Set<Integer> createSet() {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50 + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }
        for (int i : set) {
            System.out.print(i + " ");
        }
        System.out.println();
        return set;
    }

    void intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> inter = new HashSet<>(set1);
        inter.retainAll(set2);
        System.out.println("Intersection:");
        for (int i : inter) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    void union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> un = new HashSet<>(set1);
        un.addAll(set2);
        System.out.println("Union:");
        for (int i : un) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
