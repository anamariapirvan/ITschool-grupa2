package session8.homework;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Ana");
        originalList.add("Maria");
        originalList.add("Ana");
        originalList.add("Ion");
        originalList.add("Gigi");
        originalList.add("Vasile");
        originalList.add("Mihai");
        originalList.add("Geo");
        originalList.add("Ion");
        ArrayList<String> uniqueList = new ArrayList<>();
        for (String num : originalList) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        System.out.println("Original array: " + originalList);
        System.out.println("Unique array: " + uniqueList);
    }
}
