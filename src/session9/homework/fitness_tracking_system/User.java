package session9.homework.fitness_tracking_system;

import java.util.ArrayList;
import java.util.List;

import static java.util.Locale.filter;

public class User {
    private List<Workout> workouts;
    private double weeklyRunningGoal;
    private double weeklyWeightliftingGoal;

    public User(double weeklyRunningGoal, double weeklyWeightliftingGoal) {
        this.workouts = new ArrayList<>();
        this.weeklyRunningGoal = weeklyRunningGoal;
        this.weeklyWeightliftingGoal = weeklyWeightliftingGoal;
    }

    public void logWorkout(Workout workout) {
        workouts.add(workout);
    }

    public boolean hasMetRunningGoal() {
        double totalRunningDistance = workouts.stream()
                .filter(workout -> workout.getType().equals("Running"))
                .mapToDouble(Workout::getDistanceInKilometers)
                .sum();
        return totalRunningDistance >= weeklyRunningGoal;
    }

    public boolean hasMetWeightliftingGoal() {
        double totalWeightliftingKilos = workouts.stream()
                .filter(workout -> workout.getType().equals("Weightlifting"))
                .mapToDouble(Workout::getWeightLiftedInKilos)
                .sum();
        return totalWeightliftingKilos >= weeklyWeightliftingGoal;
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }
}
