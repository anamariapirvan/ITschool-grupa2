package session11.practice.football_management_system;

public class Coach {
    private String name;
    private String dateOfBirth;
    private int yearsOfExperience;
    private double salary;

    public Coach(String name, String dateOfBirth, int yearsOfExperience, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void setName() {
        this.name = name;
    }

    public void setDateOfBirth() {
        this.dateOfBirth = dateOfBirth;
    }

    public void setYearsOfExperience() {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Coach{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", salary=" + salary +
                '}';
    }
}
