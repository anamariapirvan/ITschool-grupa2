package session9.homework.school_grade_book;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentID;
    private String name;
    private List<Double> grades;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add((double) grade);
    }

    public double averageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

}
