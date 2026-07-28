package day15;

import java.util.ArrayList;
import java.util.List;

public class arraylistmethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1, 20);
        list.set(1, 2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list.addAll(list2);
        System.out.println(list);
    }
}