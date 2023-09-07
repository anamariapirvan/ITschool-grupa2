package ocaexercises.arrays_exercises;

import java.util.Arrays;

public class ArraysSort {

    public static void main(String[] args) {
        int[] numbers ={6,9,7};
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }

    }
}
