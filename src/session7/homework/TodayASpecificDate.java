package session7.homework;

import java.time.LocalDate;

public class TodayASpecificDate {

    public static void main(String[] args) {
        boolean isSpecificDate = isTodaySpecificDate(2019, 12, 10);
        System.out.println("Is today's date 2019-12-10: " + isSpecificDate);
    }

    public static boolean isTodaySpecificDate(int year, int month, int day) {
        LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(year, month, day);
        return today.isEqual(specificDate);
    }
}
