
/*Problem: Create a Student Management System

You are tasked with creating a simple Student class to manage student information.
 The class should have the following features:

Initialize the student with a name, age, and a list of course grades.
Allow adding grades to the student's record.
Calculate and display the average grade. */

package ocaexercises;

import java.util.ArrayList;

class StudentManagementSystem {
    private String name;
    private int age;
    private ArrayList<Double> grades;

    public StudentManagementSystem(String name, int age) {
        this.age = age;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public void displayAverageGrade() {
        if (grades.isEmpty()) {
            System.out.println("No grades available.");
            return;
        }
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        double average = total / grades.size();
        System.out.println("Average grade: " + average);
    }
}

public class Student {
    public static void main(String[] args) {
        StudentManagementSystem student = new StudentManagementSystem("Ana", 30);
        student.addGrade(9.50);
        student.addGrade(9.20);
        student.addGrade(8.20);

        student.displayAverageGrade();
    }
}

