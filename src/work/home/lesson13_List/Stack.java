package work.home.lesson13_List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
Ввести с консоли число, занести его цифры в стек. Стек –самостоятельноспроектированный класс, поддерживающий 3 операции:
- Задать размер стека
- Внести цифру в стек.
- Извлечь цифру из стека
Вывести число, у которого цифры идут в обратном порядке
 */

public class Stack {
    List<Character> stack(int size) {
        List<Character> stack = new ArrayList<>(size);
        return stack;
    }

    void addToStack(List<Character> list, String str) {
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            list.add(ch[i]);
        }
        getFromStack(list);

    }

    void getFromStack(List list) {
        ListIterator iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();
    }
}
