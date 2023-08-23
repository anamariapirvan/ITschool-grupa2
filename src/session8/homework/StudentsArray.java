package session8.homework;

import java.util.ArrayList;

public class StudentsArray {

    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        //populate studentList with 10 students
        for (int i = 1; i <= 10; i++) {
            studentList.add("Student" + i);
        }
        ArrayList<String> graduateStudentList = new ArrayList<>();
        graduateStudentList.addAll(studentList);

        for (String student : graduateStudentList) {
            System.out.println("Graduated:" + student);
        }
    }
}
