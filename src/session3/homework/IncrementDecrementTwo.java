package session3.homework;

import java.util.Scanner;

public class IncrementDecrementTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer value: ");
        int var = scanner.nextInt();

        var++;
        System.out.println("The value of the integer after incrementation is: " + var);
        var--;
        System.out.println("The value of the integer after decrementation is: " + var);

        scanner.close();

    }
}
