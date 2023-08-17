package session3.homework;

import java.util.Scanner;

public class ByteValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number is: ");
        byte num1 = scanner.nextByte();
        System.out.println("Second number is: ");
        byte num2 = scanner.nextByte();
        byte sum = (byte) (num2 + num1);
        System.out.println("Result of the addition is: " + sum);

        scanner.close();

    }
}
