package work.home.lesson13_List;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CustomComparator {



    public static void main(String[] args) {
        List<Integer> personList = Arrays.asList(4, 3,7, 2,0, 5);
        personList.sort((o1, o2) -> o1 - o2);
        for (Integer i : personList){
            System.out.print(i + " ");
        }
    }

}
