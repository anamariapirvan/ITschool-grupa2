package ocaexercises.whileloops;

import java.util.Scanner;
import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(5) + 1;
        Scanner scanner = new Scanner(System.in);
        int numberIntroduced;
        int numberOfGuesses = 0;
        int introducedNumber;
        do {
            System.out.println("Guess the number:");
            introducedNumber = scanner.nextInt();
            numberOfGuesses++;

            if (introducedNumber > randomNumber) {
                System.out.println("The number you introduced is too high");
            } else if (introducedNumber < randomNumber) {
                System.out.println("The number you introduced is too low");
            } else {
                System.out.println("You guessed the number");
                System.out.println("Number of guesses: " + numberOfGuesses);
            }
        } while (introducedNumber != randomNumber);
        scanner.close();
    }
}