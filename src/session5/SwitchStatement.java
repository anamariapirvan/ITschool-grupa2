package session5;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

public class SwitchStatement {

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNSDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number (1-7) for day of the week");
        int day = scanner.nextInt();

        switch (day){
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNSDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURDAY:
                System.out.println("Saturday");
                break;
            case SUNDAY:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}

