package work.home.lesson13_Set_Map;


import java.util.*;

public class BlackBox<T> {
    Set<T> set = new TreeSet<>();
    Iterator<T> iterator;


    void addToBlackBox(T value) {
        set.add(value);

    }

    T returnK(int k) throws IndexOutOfBoundsException {
        if (k > set.size()) {
            throw new IndexOutOfBoundsException();
        }
        iterator = set.iterator();
        T x = iterator.next();
        if (k == 1)
            return x;
        else {
            int counter = 1;
            while (iterator.hasNext()) {
                if (counter == k) {
                    break;
                }
                x = iterator.next();
                counter++;
            }
        }
        return x;
    }

    void print() {
        set.forEach(s -> System.out.print(s + " "));
        System.out.println();
    }


    T returnN(int n) throws IndexOutOfBoundsException {
        if (n > set.size()) {
            throw new IndexOutOfBoundsException();
        }
        iterator = set.iterator();
        T x = iterator.next();
        if (n == set.size())
            return x;
        else {
            int counter = 1;
            while (iterator.hasNext()) {
                if (counter == set.size() - (n -1)) {
                    break;
                }
                x = iterator.next();
                counter++;
            }
        }
        return x;
    }
}
