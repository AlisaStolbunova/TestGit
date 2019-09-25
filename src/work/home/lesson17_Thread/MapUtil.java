package work.home.lesson17_Thread;

import java.util.Map;

public class MapUtil {

    public static void addPartToMap(Map<Parts, Integer> parts, Parts key, Integer count) {
        Integer oldValue = parts.get(key);
        if (oldValue != null) {
            parts.put(key, oldValue + count);
        } else {
            parts.put(key, count);
        }
    }

    public static void removePartFromMap(Map<Parts, Integer> parts, Parts key, Integer count) {
        Integer oldValue = parts.get(key);
        if (oldValue != null) {
            int newValue = oldValue - count;
            parts.put(key, Math.max(newValue, 0));
        } else {
            parts.put(key, 0);
        }
    }
}
