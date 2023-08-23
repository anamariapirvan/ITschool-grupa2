package session8.homework;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentNamesLinkedList {

    public static void main(String[] args) {
        LinkedList<String> studentList=new LinkedList<>();
        Scanner scanner= new Scanner(System.in);
        studentList.add("Ana");
        studentList.add("Maria");
        studentList.add("Ion");
        studentList.add("Anghel");
        studentList.add("Mitica");
        studentList.add("Vasile");
        System.out.println("Enter the name of the student to remove");
        String studentToRemove= scanner.next();
       boolean removed= studentList.remove(studentToRemove);
       if(removed){
           System.out.println(studentToRemove + " has been removed from the list");
        } else {
           System.out.println(studentToRemove + " was not found in the list");
       }
        System.out.println("Updated student list: " + studentList);
       scanner.close();
    }
}
