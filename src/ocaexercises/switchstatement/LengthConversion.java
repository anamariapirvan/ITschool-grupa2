package ocaexercises.switchstatement;

import java.util.Scanner;

public class LengthConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length Conversion Menu");
        System.out.println("1. Meters to Feet");
        System.out.println("2. Feet to Meters");
        System.out.println("3.Exit Menu");
        System.out.println("Enter you choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter meters: ");
                double meters = scanner.nextInt();
                double feet = metersToFeet(meters);
                System.out.println(meters + " meters " + " are " + feet + " feet");
                break;
            case 2:
                System.out.println("Enter feet: ");
                double feetTwo = scanner.nextDouble();
                double metersTwo = feetToMeters(feetTwo);
                System.out.println(feetTwo + " feet " + " are " + metersTwo + " meters");
                break;
            case 3:
                System.out.println("You choose to exit");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    private static double feetToMeters(double feet) {
        return feet * 0.3048;
    }
    private static double metersToFeet(double meters) {
        return meters * 3.28084;
    }
}

