package session5.homework;
import java.util.Scanner;
public class DoWhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rightNumber = 20;


        int number;
        do {
            System.out.println("Guess the right number: ");
            number = scanner.nextInt();
            if (number == rightNumber) {
                System.out.println("You guessed the right number");
            } else if (number > rightNumber) {
                System.out.println("The number you entered is too hight");
            } else if (number < rightNumber) {
                System.out.println("The number you entered is too low");

            }
        }
        while (number != rightNumber);

        scanner.close();
        }
    }


