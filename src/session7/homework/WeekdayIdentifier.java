package session7.homework;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekdayIdentifier {

    public static void main(String[] args) {
        String inputDate = "2023-08-18";
        String dayOfWeek = findDayOfWeek(inputDate);
        System.out.println("Day of the week for " + inputDate + ": " + dayOfWeek);

    }

    public static String findDayOfWeek(String inputDate) {
        LocalDate date = LocalDate.parse(inputDate);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.toString();
    }
}
