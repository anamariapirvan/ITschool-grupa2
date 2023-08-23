package session8.homework;

public class EvenNumbersExample {

    public static void main(String[] args) {
        int integerArray []={ 4,8,23,65,76,89,3,7};
        int evenCount=0;
        for(int i =0; i<integerArray.length;i++){
            if(integerArray[i]%2==0){
                evenCount++;
            }
        }
        System.out.println("Number of even numbers: " + evenCount);
    }
}
