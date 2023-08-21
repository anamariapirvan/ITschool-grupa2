package session7.homework;

import java.time.LocalDate;

public class DateArithmetic {

    public static void main(String[] args) {
        int weeksToAdd = 3;
        LocalDate resultDate = addWeeksToToday(weeksToAdd);
        System.out.println(weeksToAdd + "weeks from today: " + resultDate);

    }

    public static LocalDate addWeeksToToday(int weeks) {
        LocalDate today = LocalDate.now();
        LocalDate resultDate = today.plusWeeks(weeks);
        return resultDate;
    }
}
