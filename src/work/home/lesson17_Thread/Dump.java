package work.home.lesson17_Thread;


import java.util.HashMap;
import java.util.Map;

public class Dump {
    private  Map<Parts, Integer> partsInDump = new HashMap<>();

    public void putParts(Parts part, int count) {
        MapUtil.addPartToMap(partsInDump, part, count);
    }

    public synchronized void getParts(Map<Parts, Integer> map, int random) {
        while (random > 0) {
            int randomParts = (int) (Math.random() * 9);
            Parts part = Parts.values()[randomParts];
            int numberOfPart = partsInDump.get(part);
            if (numberOfPart > 0) {
                MapUtil.addPartToMap(map, part, 1);
                MapUtil.removePartFromMap(partsInDump, part, 1);
                random--;
            }
        }
    }


    public void print() {
        partsInDump.forEach((k, v) -> System.out.println("Parts " + k + " count " + v));
    }

    public int sum() {
        return partsInDump.values().stream().mapToInt(Integer::intValue).sum();
    }


}
