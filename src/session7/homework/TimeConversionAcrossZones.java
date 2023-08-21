package session7.homework;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class TimeConversionAcrossZones {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a date and time (YYYY-MM-DD HH:MM:SS):");
        String inputDate= scanner.nextLine();
        System.out.println("Enter timezone (e.g., \"EST\"): ");
        String timeZone= scanner.nextLine();
        convertToTimeZone(inputDate, timeZone);
    }
    public static void convertToTimeZone( String inputDateTime, String timeZone){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime=LocalDateTime.parse(inputDateTime, formatter);
        ZoneId zoneId=ZoneId.of(timeZone);
        ZonedDateTime zonedDateTime=localDateTime.atZone(zoneId);
        DateTimeFormatter outputFormatter=DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss z");
        String recalibratedDateTime=zonedDateTime.format(outputFormatter);
        System.out.println("Recalibrated date and time: " + recalibratedDateTime);
    }
}
