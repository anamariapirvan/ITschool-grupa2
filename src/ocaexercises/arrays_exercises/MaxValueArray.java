package ocaexercises.arrays_exercises;

import java.util.Arrays;

public class MaxValueArray {

    public static void main(String[] args) {
        int maxValue = 0;
        int[] numbers = {2, 3, 5, 7, 8, -2, -5, -7};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > i) {
                maxValue = numbers[i];
            }
            if (numbers[i] < 0) {
                numbers[i] = maxValue;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
