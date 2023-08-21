package session7.homework;

public class displayDateComponents {

    public static void main(String[] args) {
        displayDateComponentsMethod("2023-08-18");
    }

    public static void displayDateComponentsMethod(String inputDate) {
        String[] components = inputDate.split("-");
        String year = components[0];
        String month = components[1];
        String day = components[2];
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}
