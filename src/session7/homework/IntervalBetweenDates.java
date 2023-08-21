package session7.homework;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class IntervalBetweenDates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first date YYYY-MM-DD: ");
        String date1 = scanner.nextLine();
        System.out.println("Enter the second date YYYY-MM-DD: ");
        String date2 = scanner.nextLine();
        int daysDifference = daysBetween(date1, date2);
        System.out.println("Difference in days: " + daysDifference);

    }
    public static int daysBetween(String date1, String date2) {
        LocalDate localDate1 = LocalDate.parse(date1);
        LocalDate localDate2 = LocalDate.parse(date2);
        return (int) ChronoUnit.DAYS.between(localDate1, localDate2);
    }
}
