package work.home.lesson13_Set_Map;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        CountUnique cu = new CountUnique();
        List<Integer> list = new ArrayList<>();
        cu.fillList(list);
        System.out.println(cu.countUnique(list) + " unique numbers");


    }
}
