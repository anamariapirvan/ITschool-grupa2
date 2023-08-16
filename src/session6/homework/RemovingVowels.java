package session6.homework;

import java.util.Scanner;

public class RemovingVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce a string: ");
        String input = scanner.nextLine();

        String result = removeVowels(input);
        System.out.println("String after removing vowels: " + result);

    }

    public static String removeVowels(String input) {
        StringBuilderCounter resultBuilder = new StringBuilderCounter();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (isVowel(currentChar)) {
                resultBuilder.append(currentChar);
            }
        }
        return resultBuilder.toString();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
