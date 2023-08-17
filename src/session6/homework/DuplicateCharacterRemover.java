package session6.homework;

import java.util.Scanner;

public class DuplicateCharacterRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String input) {
        StringBuilderCounter resultBuilder = new StringBuilderCounter();
        boolean[] seen = new boolean[128]; // Assuming ASCII characters

        for (char c : input.toCharArray()) {
            if (!seen[c]) {
                resultBuilder.append(String.valueOf(c));
                seen[c] = true;
            }
        }
        return resultBuilder.toString();
    }
}

