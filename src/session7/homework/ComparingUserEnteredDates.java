package session7.homework;

import java.time.LocalDate;
import java.util.Scanner;

public class ComparingUserEnteredDates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first date, YYYY-MM-DD: ");
        String dateOne = scanner.next();
        System.out.println("Enter the second date, YYYY-MM-DD: ");
        String dateTwo = scanner.next();
        boolean equal = DatesEquals(dateOne, dateTwo);
        System.out.println("Dates are equal: " + equal);
        scanner.close();

    }

    public static boolean DatesEquals(String dateOne, String dateTwo) {
        LocalDate localDateOne = LocalDate.parse(dateOne);
        LocalDate localDateTwo = LocalDate.parse(dateTwo);
        return localDateOne.isEqual(localDateTwo);
    }
}
