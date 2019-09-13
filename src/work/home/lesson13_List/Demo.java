package work.home.lesson13_List;

import work.home.lesson8_String.SubEquals;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        SchoolReport sr = new SchoolReport();
        List<Integer> report = new ArrayList<>();
        sr.fillList(report);
        sr.deleteBadMark(report);
        sr.maxMark(report);

        List<String> surnames = Arrays.asList("Ivanov", "Petrov", "Sidorov");
        Surname<String> s = new Surname<>();
        s.reverseOrder1(surnames);
        s.reverseOrder2(surnames);

        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input stack size:");
        int size = sc.nextInt();
        System.out.println("Input number:");
        stack.addToStack(stack.stack(size), sc.next());

        SetClass set = new SetClass();
        System.out.println("Set1:");
        Set<Integer> set1 = set.createSet();
        System.out.println("Set2:");
        Set<Integer> set2 = set.createSet();
        set.intersection(set1, set2);
        set.union(set1, set2);

        Vocabulary v = new Vocabulary();
        v.createMap("Mama rama cat dog mama dog dog");

        Sort r = new Sort();
        List<Integer> list = new ArrayList<>();
        r.fillList(list);
        r.sort(list);


    }
}
