package session6.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringBuilderCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> frequencyMap = countCharacterFrequency(input);

        System.out.println("Character frequency:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        return frequencyMap;
    }

    public void append(String original, int startIndex, int length) {

    }

    public void append(String replacementSubstring) {


    }
}

