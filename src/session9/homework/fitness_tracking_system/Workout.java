package session9.homework.fitness_tracking_system;

import java.time.LocalDate;

public class Workout {
    private String type;
    private LocalDate date;
    private int durationInMinutes;
    private double distanceInKilometers;
    private double weightLiftedInKilos;

    public Workout(String type, LocalDate date, int durationInMinutes, double distanceInKilometers, double weightLiftedInKilos) {
        this.type = type;
        this.date = date;
        this.distanceInKilometers = distanceInKilometers;
        this.durationInMinutes = durationInMinutes;
        this.weightLiftedInKilos = weightLiftedInKilos;
    }

    public String getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public double getDistanceInKilometers() {
        return distanceInKilometers;
    }

    public double getWeightLiftedInKilos() {
        return weightLiftedInKilos;
    }
}
