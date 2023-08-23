package session8.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FruitsArrayList {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Grape");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Pineapple");

        // Implement custom sorting using Comparator chaining and lambda expression
        Collections.sort(fruits, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));

        // Print the sorted list
        System.out.println("Sorted fruits: " + fruits);
    }
}

