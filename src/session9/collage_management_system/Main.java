package session9.collage_management_system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = null;
        try {
            birthDate = dateFormat.parse("2000-01-15"); // Data example
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Student student1 = new Student("Ana", "Pirvan", 'F', birthDate, "8365246383", "Str. Primaverii 23");
        Professor professor1 = new Professor("Ionut", "Popescu", 'M', birthDate, "4557682", " Str. Baciu 2");
        Course course1 = new Course("Math", "8:00 AM - 10:00 AM", 5, "Math calculations", professor1);
        course1.setAssignProfessor(professor1);
        CollegeManagementSystem collegeSystem = new CollegeManagementSystem();
        collegeSystem.addStudent(student1);
        collegeSystem.addProfessor(professor1);
        collegeSystem.addCourse(course1);

        Course retrievedCourse = collegeSystem.getCourseDetails("Math");
        if (retrievedCourse != null) {
            System.out.println("Course Name: " + retrievedCourse.getName());
            System.out.println("Assigned Professor: " + retrievedCourse.getAssignedProfessor().getFirstName());
        }

        //information about the student
        System.out.println("Student details: ");
        System.out.println("First name: " + student1.getFirstName());
        System.out.println("Last name: " + student1.getLastName());
        System.out.println("Date of birth: " + student1.getDateOfBirth());
        System.out.println("Age: " + student1.calculateAge());

    }
}
