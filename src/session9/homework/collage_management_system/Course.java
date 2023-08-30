package session9.homework.collage_management_system;

public class Course {
    private String name;
    private String schedule;
    private int duration;
    private String description;
    private Professor assignedProfessor;

    public Course(String name, String schedule, int duration, String description, Professor assignProfessor) {
        this.name = name;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
        this.assignedProfessor = assignedProfessor;
    }

    public String getName() {
        return name;
    }

    public String getSchedule() {
        return schedule;
    }

    public int getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    public Professor getAssignedProfessor() {
        return assignedProfessor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAssignProfessor(Professor assignedProfessor) {
        this.assignedProfessor = assignedProfessor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", schedule='" + schedule + '\'' +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                ", assignedProfessor=" + assignedProfessor +
                '}';
    }
}
