package session9.collage_management_system;

import java.util.ArrayList;
import java.util.List;

public class CollegeManagementSystem {
    private List<Student> students;
    private List<Professor> professors;
    private List<Course> courses;
    public CollegeManagementSystem(){
        students=new ArrayList<>();
        professors=new ArrayList<>();
        courses=new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void addProfessor(Professor professor){
        professors.add(professor);
    }
    public void addCourse(Course course){
        courses.add(course);
    }
    public Course getCourseDetails(String courseName){
        for(Course course: courses){
            if(course.getName().equalsIgnoreCase(courseName)){
                return course;
            }
        }
        return null;
    }
}
