package work.home.lesson17_Thread;

import java.util.HashMap;
import java.util.Map;


public class Laborer extends Thread {
    Map<Parts, Integer> allParts = new HashMap<>(9);
    int robots = 0;

    public void run() {
        try {
            int nights = 50;
            while (nights > 0) {
                Thread.sleep(100);
                nights--;
                int random = (int) (1 + Math.random() * 4);
                int sum = Factory.parts.values().stream().mapToInt(Integer::intValue).sum();
                System.out.println("Parts in a dump " + sum);
                if (random > sum) {
                    random = sum;
                }
                System.out.println("Laborer gets " + random + " detail(s)");
                Map<Parts, Integer> laborerParts = new HashMap<>(random);
                getParts(laborerParts, random);
                passToScientist(laborerParts);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private void getParts(Map<Parts, Integer> map, int random){
        while (random > 0) {
            int randomParts = (int) (Math.random() * 9);
            Parts part = Parts.values()[randomParts];
            int numberOfPart = Factory.parts.get(part);
            if (numberOfPart > 0) {
                MapUtil.addPartToMap(map, part, 1);
                MapUtil.removePartFromMap(Factory.parts, part, 1);
                random--;
            }
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
   //         System.out.println(robots + "**************************");
        }
    }


}
