package session9.school_grade_book;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {

    private String className;
    private List<Student> students;

    public SchoolClass(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void assignGrade(int studentID, double grade) {
        for (Student student : students) {
            if (student.getStudentID() == studentID) {
                student.addGrade((int) grade);
                break;
            }
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}
