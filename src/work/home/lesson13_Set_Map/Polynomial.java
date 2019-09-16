package work.home.lesson13_Set_Map;

/*
Сложить два многочлена заданной степени, если коэффициенты многочленов хранятся в двух объектах HashMap в виде:
Ключ: номер степени
Значение: значение множителя
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Polynomial {
    void addPolynomial(Map<Integer, Integer> map1, Map<Integer, Integer> map2, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> keys1 = map1.keySet();
        Iterator<Integer> i1 = keys1.iterator();
        Integer k1;
        while (i1.hasNext()) {
            k1 = i1.next();
            map.put(k1, (map1.get(k1) + map2.get(k1)));
        }
        printPolynomial(map, n);

    }

    void createPolynomial(int n) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            map1.put(i, (int) (Math.random() * 10 + 1));
            map2.put(i, (int) (Math.random() * 10 + 1));
        }

        printPolynomial(map1, n);
        printPolynomial(map2, n);
        addPolynomial(map1, map2, n);
    }

    void printPolynomial(Map<Integer, Integer> map, int n) {
        for (int i = n; i >= 0; i--) {
            if (map.get(i) == 0) {
                continue;
            }
            if (map.get(i) == 1 && i != 0) {
                String print = i != 1 ? ("x^" + i + " + ") : ("x" + " + ");
                System.out.print(print);
                continue;
            }
            if (i == 1) {
                System.out.print(map.get(i) + "*x + ");
                continue;
            }
            if (i == 0) {
                System.out.println(map.get(i));
                break;
            }
            System.out.print(map.get(i) + "*x^" + i + " + ");
        }
    }
}
