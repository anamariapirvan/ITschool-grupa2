package session6.homework;

import java.util.Scanner;

public class WordCapitalizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String capitalized = capitalizeWords(input);
        System.out.println("Capitalized sentence: " + capitalized);
    }

    public static String capitalizeWords(String sentence) {
        StringBuilderCounter resultBuilder = new StringBuilderCounter();
        boolean capitalizeNext = true;

        for (char c : sentence.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
                resultBuilder.append(String.valueOf(c));
            } else {
                if (capitalizeNext) {
                    resultBuilder.append(String.valueOf(Character.toUpperCase(c)));
                    capitalizeNext = false;
                } else {
                    resultBuilder.append(String.valueOf(Character.toLowerCase(c)));
                }
            }
        }

        return resultBuilder.toString();
    }
}
