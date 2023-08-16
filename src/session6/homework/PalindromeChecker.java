package session6.homework;

import java.util.Scanner;

public class PalindromeChecker {

    private static String reversed;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce a string: ");
        String input = scanner.nextLine();
        String initialInput = input;
        String reversed = PalindromeChecker1(input);

        if (initialInput.equals(reversed)) {
            System.out.println("The string is palindrome: " + reversed);
        } else {
            System.out.println("The string is not palindrome: " + reversed);
        }
        scanner.close();
    }

    public static String PalindromeChecker1(String input) {
        StringBuilderCounter reversed = new StringBuilderCounter();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(String.valueOf(input.charAt(i)));
        }
        return reversed.toString();
    }
}
