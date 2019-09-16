package work.home.lesson13_Set_Map;

/*
Написать метод isUnique, который принимает Map<String, String> и возвращает true,
если два различных ключа не соответствуют двум одинаковым значениям.
 */

import java.util.*;

public class UniqueValue<K, V> {
    boolean isUnique(Map<K, V> map) {
        Set<V> values = new HashSet<>(map.values());
        return (values.size() == map.values().size());
    }
}
