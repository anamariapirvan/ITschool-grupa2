package session8.homework;

public class ReverseArrayExample {

    public static void main(String[] args) {
        int[] numbers = {3, 6, 8, 45, 2, 76, 56, 98, 9};
        int length = numbers.length;
        int[] reversedNumbers = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            reversedNumbers[length - i - 1] = numbers[i];
        }
        for (int num : reversedNumbers) {
            System.out.println(num + " ");
        }
    }
}
