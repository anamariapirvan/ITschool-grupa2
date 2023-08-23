package session8.homework;

public class FindMaxValue {

    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 34, 21, 16, 9, 4};
        int max = numbers[0]; // Assume the first element is the maximum
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value: " + max);
    }
}
