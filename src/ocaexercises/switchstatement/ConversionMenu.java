package ocaexercises.switchstatement;

import java.util.Scanner;

public class ConversionMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversion Menu");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Kilometers to Miles");
        System.out.println("3. Exit");
        System.out.println("Enter you choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + " C is " + fahrenheit + " F");
                break;
            case 2:
                System.out.println("Enter Kilometers");
                double kilometers = scanner.nextDouble();
                double miles = kilometersToMiles(kilometers);
                System.out.println(kilometers + " kilometers is " + miles + " miles ");
                break;
            case 3:
                System.out.println("You selected to Exit");
                break;
            default:
                System.out.println("Your option is invalid");
        }
        scanner.close();
    }

    private static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    private static double celsiusToFahrenheit(double celsius) {

        return (celsius * 9 / 5) + 32;
    }

}
