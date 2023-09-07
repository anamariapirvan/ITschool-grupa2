package ocaexercises.arrays_exercises;

import java.util.Arrays;

public class InitializingArrays {

    public static void main(String[] args) {

//        int [] numberArray=new int [10];
//        int i=0;
//        while(i<10){
//            numberArray[i]=i;
//            i++;
//        }
//       i=0;
//        while(i<10){
//            System.out.println((i+1) + " array element= " + numberArray[i]);
//        }
//        int [] numberArray= new int[10];
//        for(int index=0;index<10;index++){
//            numberArray[index]=index;
//        }
//        System.out.println(Arrays.toString(numberArray));

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
