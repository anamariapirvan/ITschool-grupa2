package session7.practice;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

    }

    public static void printUserInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String userNAme= scanner.nextLine();
        System.out.println("Hello" + userNAme + "!");
    }
}
