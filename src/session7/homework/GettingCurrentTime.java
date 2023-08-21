package session7.homework;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GettingCurrentTime {

    public static void main(String[] args) {
        displayCurrentTime();

    }
    public static void displayCurrentTime(){
        LocalTime currentTime=LocalTime.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime=currentTime.format(formatter);
        System.out.println("Current time: " + formattedTime);
    }
}
