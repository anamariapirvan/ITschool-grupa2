package session6.homework;
import java.util.Scanner;

public class StringInsertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String original = scanner.nextLine();

        System.out.print("Enter the string to insert: ");
        String toInsert = scanner.nextLine();

        System.out.print("Enter the index to insert at: ");
        int index = scanner.nextInt();

        String result = insertAtIndex(original, toInsert, index);
        System.out.println("Result after insertion: " + result);
    }

    public static String insertAtIndex(String original, String toInsert, int index) {
        StringBuilder resultBuilder = new StringBuilder (original);

        if (index >= 0 && index <= original.length()) {
            resultBuilder.insert(index, toInsert);
        } else {
            System.out.println("Invalid index.");
        }

        return resultBuilder.toString();
    }
}
