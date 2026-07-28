package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class clear {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Before clear : " + list);
        list.clear();
        System.out.println("After clear  : " + list);
        System.out.println("Is list empty? " + list.isEmpty());
    }
}