package session5.homework;

public class CountingNegativeNumbers {

    public static void main(String[] args) {
        int[] numbers = {-1, -2, 3, -4, -5, 6, -7, -8, -9, -10};
        int negativeCount = countNegativeNumbers(numbers);
        System.out.println("Number of negative integers: " + negativeCount);
    }
    public static int countNegativeNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number < 0) {
                count++;
            }
        }
        return count;
    }
}
