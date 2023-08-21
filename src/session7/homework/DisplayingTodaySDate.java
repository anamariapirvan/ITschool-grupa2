package session7.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DisplayingTodaySDate {

    public static void main(String[] args) {
        displayTodaysDate();

    }

    public static void displayTodaysDate() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Today's date: " + formattedDate);
    }
}
