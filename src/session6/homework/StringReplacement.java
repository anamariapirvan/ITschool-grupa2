package session6.homework;
import java.util.Scanner;

public class StringReplacement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String original = scanner.nextLine();

        System.out.print("Enter the substring to replace: ");
        String substringToReplace = scanner.nextLine();

        System.out.print("Enter the replacement substring: ");
        String replacementSubstring = scanner.nextLine();

        String result = replaceSubstring(original, substringToReplace, replacementSubstring);
        System.out.println("Result after replacement: " + result);
    }

    public static String replaceSubstring(String original, String substringToReplace, String replacementSubstring) {
        StringBuilderCounter resultBuilder = new StringBuilderCounter();

        int startIndex = 0;
        int nextIndex = original.indexOf(substringToReplace);

        while (nextIndex != -1) {
            resultBuilder.append(original, startIndex, nextIndex); // Append characters before the match
            resultBuilder.append(replacementSubstring); // Append the replacement substring
            startIndex = nextIndex + substringToReplace.length(); // Update the start index
            nextIndex = original.indexOf(substringToReplace, startIndex); // Find the next occurrence
        }

        resultBuilder.append(original, startIndex, original.length()); // Append characters after the last match

        return resultBuilder.toString();
    }
}
