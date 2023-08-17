package session4.homework;

public class TemperatureExercise {

    public static void main(String[] args) {
        int temperature = 31;
        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }

    }
}
