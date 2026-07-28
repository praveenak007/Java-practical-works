package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class removeif {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<String> list1 = new ArrayList<>(Arrays.asList("1", "2", "3"));
        list.remove(1);
        list1.remove("1");
        list.removeIf(n -> n % 2 == 0);
        System.out.println("Integer List : " + list);
        System.out.println("String List  : " + list1);
    }
}