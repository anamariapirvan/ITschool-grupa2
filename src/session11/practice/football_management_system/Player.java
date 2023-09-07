package session11.practice.football_management_system;


import java.util.Iterator;
import java.util.List;

public class Player {

    private int playerId;
    private String name;
    private String dateOfBirth;
    private String position;
    private int goalScored;
    private double salary;

    public Player(int playerId, String name, String dateOfBirth, String position, int goalScored, double salary) {
        this.playerId = playerId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
        this.goalScored = goalScored;
        this.salary = salary;
    }


    public void setName() {
        this.name = name;
    }

    public void setDateOfBirth() {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPosition() {
        this.position = position;
    }

    public void setGoalScored(int goalScored) {
        this.goalScored = goalScored;
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

    public String getPosition() {
        return position;
    }

    public int getGoalScored() {
        return goalScored;
    }

    public double getSalary() {
        return salary;
    }

    int getPlayerId() {
        return 0;
    }
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", position='" + position + '\'' +
                ", goalsScored=" + goalScored +
                ", salary=" + salary +
                '}';
    }
}

