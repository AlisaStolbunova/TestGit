package work.home.lesson13_Set_Map;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        CountUnique cu = new CountUnique();
        List<Integer> list = new ArrayList<>();
        cu.fillList(list);
        System.out.println(cu.countUnique(list) + " unique numbers");

        Map<String, String> map = new HashMap<String, String>() {{
            put("Marty", "Stepp");
            //put("Mar", "Stepp");
            put("Stuart", "Reges");
            put("Jessica", "Miller");
            put("Amanda", "Camp");
            // put("Hal","Perkins");
            put("Halli", "Perkins");
        }};

        UniqueValue uv = new UniqueValue();
        System.out.println(uv.isUnique(map));

        Polynomial p = new Polynomial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input exponent");
        int n = sc.nextInt();
        p.createPolynomial(n);

        BlackBox bb = new BlackBox();
        for (int i = 0; i < 5; i++) {
            bb.addToBlackBox((int) (Math.random() * 20 + 1));
        }
        bb.print();
        bb.addToBlackBox(7);
        bb.print();

        try {
            System.out.println(bb.returnK(3));
            System.out.println(bb.returnN(2));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Incorrect number");
            ex.printStackTrace();
        }


    }
}
