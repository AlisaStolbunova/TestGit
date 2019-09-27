package work.home.lesson17_Thread;

import java.util.HashMap;
import java.util.Map;


public class Laborer extends Thread {
    private Dump dump;

    Laborer(Dump map) {
        this.dump = map;
    }

    Map<Parts, Integer> allParts = new HashMap<>(9);
    int robots = 0;

    public void run() {
        try {
            int nights = 50;
            while (nights > 0) {
                Thread.sleep(100);
                nights--;
                int random = (int) (1 + Math.random() * 4);
                int sum = dump.sum();
                System.out.println("Parts in a dump " + sum);
                if (random > sum) {
                    random = sum;
                }
                System.out.println("Laborer " + Thread.currentThread().getName() + " gets " + random + " detail(s)");
                Map<Parts, Integer> laborerParts = new HashMap<>(random);
                dump.getParts(laborerParts, random);
                passToScientist(laborerParts);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    private void passToScientist(Map<Parts, Integer> parts) {
        parts.forEach((k, v) -> MapUtil.addPartToMap(allParts, k, v));
        while (true) {
            for (Parts part : Parts.values()) {
                Integer storedPart = allParts.get(part);
                if (storedPart == null || storedPart == 0) {
                    return;
                }
            }
            for (Parts value : Parts.values()) {
                MapUtil.removePartFromMap(allParts, value, 1);
            }
            robots++;
        }
    }


}
