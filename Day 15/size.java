package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class size {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Mango"));

        System.out.println("Fruits List : " + fruits);
        System.out.println("Size of the list : " + fruits.size());
    }
}