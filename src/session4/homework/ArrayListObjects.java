package session4.homework;

import java.util.ArrayList;

public class ArrayListObjects {
    public static void main(String[] args) {
        // Create two ArrayList objects
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();

        // Add elements to listOne
        listOne.add("Apple");
        listOne.add("Banana");
        listOne.add("Cherry");

        // Assign listOne to listTwo
        listTwo = listOne;

        // Modify listOne by adding a new element
        listOne.add("Grapes");

        // Print both lists
        System.out.println("listOne: " + listOne);
        System.out.println("listTwo: " + listTwo);
    }
}
