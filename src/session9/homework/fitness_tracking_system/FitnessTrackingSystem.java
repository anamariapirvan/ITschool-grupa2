package session9.homework.fitness_tracking_system;

import java.time.LocalDate;

public class FitnessTrackingSystem {

    public static void main(String[] args) {
        User user = new User(10.0, 150); // set weekly goals
        Workout workout1 = new Workout("Running", LocalDate.now().minusDays(1), 60, 5, 20);
        Workout workout2 = new Workout("Weightlifting", LocalDate.now().minusDays(2), 40, 7, 50);

        user.logWorkout(workout1);
        user.logWorkout(workout2);

        System.out.println("Logged workouts: ");
        for (Workout workout : user.getWorkouts()) {
            System.out.println("Type: " + workout.getType() + " , Date: " + workout.getDate() + " , Duration: " + workout.getDurationInMinutes() + "mins");
        }
        System.out.println("Running goal met: " + user.hasMetRunningGoal());
        System.out.println("Weightlifting goal met: " + user.hasMetWeightliftingGoal());
    }
}
