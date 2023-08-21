package session7.homework;

import java.time.Duration;
import java.time.LocalTime;

public class DurationSince {

    public static void main(String[] args) {
        String priorTime = "12:30:00";
        elapsedTimeSince(priorTime);

    }
    public static void elapsedTimeSince(String priorTime) {
        LocalTime currentTime = LocalTime.now();
        LocalTime inputTime = LocalTime.parse(priorTime);
        Duration duration = Duration.between(inputTime, currentTime);
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        long seconds = duration.toSeconds();
        System.out.println("Time span: " + hours + "hours, " + minutes + "minutes, " + seconds + "seconds.");

    }
}
