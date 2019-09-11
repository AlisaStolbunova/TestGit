package work.home.lesson12_Generics;

public class GenericsDemo {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(5, "str");
        System.out.println(pair);
        Pair<String, Integer> pair1 = PairUtil.swap(pair);
        System.out.println(pair1);

        Arithmetic<Integer> a = new Arithmetic<>(4, 2);
        System.out.println(a.getMultiply());
        Arithmetic<Float> b = new Arithmetic<>(4.2f, 3.0f);
        System.out.println(b.getSub());


    }
}
