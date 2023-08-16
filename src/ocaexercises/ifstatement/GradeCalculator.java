package ocaexercises.ifstatement;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student's score: ");
        double studentScore = scanner.nextDouble();
        if (studentScore >= 90 && studentScore <= 100) {
            System.out.println("The student took A.");
        } else if (studentScore >= 80 && studentScore <= 89) {
            System.out.println("The student took B.");
        } else if (studentScore >= 70 && studentScore <= 79) {
            System.out.println("The student took C.");
        } else if (studentScore >= 60 && studentScore <= 69) {
            System.out.println("The student took D.");
        } else {
            System.out.println("The student took F");

        }
        scanner.close();
    }
}
