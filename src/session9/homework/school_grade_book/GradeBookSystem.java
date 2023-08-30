package session9.homework.school_grade_book;

import java.util.List;

public class GradeBookSystem {

    public static void main(String[] args) {
        SchoolClass mathClass = new SchoolClass("Math");
        SchoolClass scienceClass = new SchoolClass("Science");

        Student student1 = new Student(2334656, "Ana Pirvan");
        Student student2 = new Student(326435, "Ion Creanga");

        mathClass.addStudent(student1);
        mathClass.addStudent(student2);
        scienceClass.addStudent(student2);

        mathClass.assignGrade(2334656, 80);
        mathClass.assignGrade(2334656, 90);
        mathClass.assignGrade(326435, 95);
        scienceClass.assignGrade(326435, 60);
        scienceClass.assignGrade(326435, 70);

        printAllStudentsWithAverage(mathClass);
        printAllStudentsWithAverage(scienceClass);
    }

    public static void printAllStudentsWithAverage(SchoolClass schoolClass) {
        System.out.println("Class: " + schoolClass.getClassName());
        List<Student> students = schoolClass.getStudents();
        for (Student student : students) {
            double averageGrade = student.averageGrade();
            System.out.println("Student " + student.getName() + ", ID: " + student.getStudentID() + " , Average Grade: " + averageGrade);
        }
        System.out.println();
    }
}
