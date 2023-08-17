package session3.homework;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The length is: ");
        double length = scanner.nextDouble();
        System.out.println("The Breadth is: ");
        double breadth = scanner.nextDouble();
        System.out.println(" The area of the rectangle is: " + (length * breadth));

        scanner.close();
    }
}
