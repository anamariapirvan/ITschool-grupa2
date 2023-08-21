package session7.homework;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class DateAuthenticator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date (YYYY-MM-DD):");
        String inputDate = scanner.nextLine();
        boolean isValid = isValidDate(inputDate);
        System.out.println("Is the date valid: " + isValid);
        scanner.close();

    }

    public static boolean isValidDate(String inputDate) {
        try {
            LocalDate.parse(inputDate);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }
}
