package session5;


import java.util.ArrayList;
import java.util.List;

public class FlowControl {

    public static void main(String[] args) {


//        printNumberWithFor(10);
          List<String> list = new ArrayList<>();
          list.add("Timisoara");
          list.add("Bucuresti");
          list.add("Cluj");
        System.out.println(list);

        int number = 1;
        while (number <= 10) {
            System.out.print(number);

            if(number<10){
                System.out.print(", ");
            }
            number++;
        }
    }

    public static void printNumberWithFor(int i){
        int input = 10;
        for(int number = 1; number<= input; number ++){
            System.out.print(number + ", ");
        }
    }
    public static void printListiWithFor(List<String> list){
        for(String listValue : list){
            System.out.println(listValue);
        }
    }
}


