package session5.homework;

import java.io.InputStream;
import java.util.Scanner;

public class FibonacciSeriesGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci series with :" + n + " terms");
        for (int i = 1; i < n; i++) {
            System.out.println(fibonacci(i) + " ");
        }
        scanner.close();
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
