//crtl alt l - formatarea codului

package session3;

import java.util.Scanner;

//psvm shortcut

public class ScannerClass {
    public static void main(String[] args) {
        System.out.println();
        String useName = "Maria";
        int userAge = 34;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide some text: ");
        String userInput = scanner.nextLine();
        System.out.println("Your input is: " + userInput);
        scanner.close();


    }
}
