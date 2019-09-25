package work.home.lesson17_Thread;

import java.util.HashMap;
import java.util.Map;

public class Factory extends Thread {
    static Map<Parts, Integer> parts = new HashMap<>();


    public void run() {
        try {
            int nights = 50;
            int total = 20;
            int count = 0;
            Thread.sleep(100);
            nights--;
            for (int i = 0; i < Parts.values().length; i++) {
                if (i == Parts.values().length - 1) {
                    parts.put(Parts.values()[i], total);
                    break;
                }
                count = getRandom(total);
                parts.put(Parts.values()[i], count);
                total -= count;
            }
            parts.forEach((k, v) -> System.out.println("Parts " + k + " count " + v));

            while (nights > 0) {
                Thread.sleep(100);
                nights--;
                int random = (int) (1 + Math.random() * 4);
                System.out.println("Factory throws " + random + " detail(s)");

                while (random > 0) {
                    int randomParts = (int) (Math.random() * 9);
                   // System.out.println(randomParts);
                    MapUtil.addPartToMap(parts, Parts.values()[randomParts], 1);
                    random--;
                }

                parts.forEach((k, v) -> System.out.println("Parts " + k + " count " + v));
            }
        }catch (InterruptedException ie){

        }
    }

    public int getRandom(int total) {
        return (int) (Math.random() * total / 3);
    }
}
