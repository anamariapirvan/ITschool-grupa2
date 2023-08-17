package session6.homework;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a string: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String input) {
        StringBuilderCounter reversed = new StringBuilderCounter();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(String.valueOf(input.charAt(i)));
        }
        return reversed.toString();
    }
}
