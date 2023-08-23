package session7.event_scheduler_and_reminder;

import java.time.LocalDateTime;
import java.time.Duration;
import java.util.Scanner;

class Event {
    private String eventName;
    private String eventDescription;
    private LocalDateTime eventDateTime;
    private LocalDateTime reminderDateTime;

    public Event(String eventName, String eventDescription, LocalDateTime eventDateTime, LocalDateTime reminderDateTime) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDateTime = eventDateTime;
        this.reminderDateTime = reminderDateTime;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public LocalDateTime getReminderDateTime() {
        return reminderDateTime;
    }

    public Duration timeUntilEvent() {
        LocalDateTime now = LocalDateTime.now();
        return Duration.between(now, eventDateTime);
    }

    public Duration timeUntilReminder() {
        LocalDateTime now = LocalDateTime.now();
        return Duration.between(now, reminderDateTime);
    }
}

public class EventSchedulerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the event name: ");
        String eventName = scanner.nextLine();

        System.out.print("Enter the event description: ");
        String eventDescription = scanner.nextLine();

        System.out.print("Enter the event year (YYYY): ");
        int year = scanner.nextInt();

        System.out.print("Enter the event month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the event day (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Enter the event hour (0-23): ");
        int hour = scanner.nextInt();

        System.out.print("Enter the event minute (0-59): ");
        int minute = scanner.nextInt();

        LocalDateTime eventDateTime = LocalDateTime.of(year, month, day, hour, minute);

        System.out.print("Enter the reminder year (YYYY): ");
        int reminderYear = scanner.nextInt();

        System.out.print("Enter the reminder month (1-12): ");
        int reminderMonth = scanner.nextInt();

        System.out.print("Enter the reminder day (1-31): ");
        int reminderDay = scanner.nextInt();

        System.out.print("Enter the reminder hour (0-23): ");
        int reminderHour = scanner.nextInt();

        System.out.print("Enter the reminder minute (0-59): ");
        int reminderMinute = scanner.nextInt();

        LocalDateTime reminderDateTime = LocalDateTime.of(reminderYear, reminderMonth, reminderDay, reminderHour, reminderMinute);

        Event event = new Event(eventName, eventDescription, eventDateTime, reminderDateTime);

        Duration timeUntilEvent = event.timeUntilEvent();
        Duration timeUntilReminder = event.timeUntilReminder();

        System.out.println("Time until event: " + timeUntilEvent.toHours() + " hours");
        System.out.println("Time until reminder: " + timeUntilReminder.toMinutes() + " minutes");
    }
}
