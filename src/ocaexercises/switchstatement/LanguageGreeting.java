package ocaexercises.switchstatement;

import java.util.Scanner;

public class LanguageGreeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a language code (en for English, fr for French, es for Spanish):");
        String language = scanner.nextLine();

        switch (language) {

            case "en":
                System.out.println("Hello!");
                break;
            case "fr":
                System.out.println("Bonjour!");
                break;
            case "es":
                System.out.println("Hola!");
                break;
            default:
                System.out.println("Invalid language");
        }
        scanner.close();
    }
}
