package session5.homework;

public class ForLoop {

    public static void main(String[] args) {
        int n = 10; //Number of terms to print
        int[] fibonacciSeries = new int[n];
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }
        System.out.println("First " + n + " numbers in the Fibonacci series: ");
        for (int i = 1; i < n; i++) {
            System.out.println(fibonacciSeries[i] + " ");
        }
    }
}
