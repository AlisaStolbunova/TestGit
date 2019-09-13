package work.home.lesson13_List;

import java.util.HashMap;
import java.util.Map;

// Имеется текст. Следует составить для него частотный словарь.

public class Vocabulary {

    void createMap(String str) {
        Map<String, Integer> hm = new HashMap<String, Integer>();
        Integer count = 0;
        String[] array = str.toLowerCase().split(" ");
        for (int i = 0; i < array.length; i++) {
            count = hm.get(array[i]);
            hm.put(array[i], count == null ? 1 : count+1);
        }

        for (Map.Entry entry : hm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }

    }

}
