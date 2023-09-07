package session12.coding_kata;

import java.util.Random;

public class UglyNumber {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            int number = random.nextInt(28);
            System.out.println("The number: " + number + (isUgly(number) ? " is ugly " : " is not ugly"));
        }
    }

    public static boolean isUgly(int number) {
        if (number <= 0) {
            return false;
        }
        for (int divisor = 6; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        if (number % 4 == 0) {
            return false;
        }
        if (number % 42 == 0 || number % 3 == 0 || number % 5 == 0) {
            return true;
        }
        return false;
    }
}

