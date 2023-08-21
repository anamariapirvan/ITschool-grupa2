package session7.practice;

import java.time.LocalDate;

public class LocalDatePractice {

    public static LocalDate main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDateIncrement = localDate.plusDays(10);
        System.out.println(localDateIncrement);


        //Find out the date of the next sunday from a given date


        return localDate;
    }
}