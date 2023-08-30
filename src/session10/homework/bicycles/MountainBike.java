package session10.homework.bicycles;

public class MountainBike extends Bicycle {
    private String tireType;
    private int suspension;

    public MountainBike(int speed, int gear, String tireType, int suspension) {
        super(speed, gear);
        this.tireType = tireType;
        this.suspension = suspension;
    }

    public void setTireType(String type) {
        tireType = type;
    }

    public void adjustSuspension(int newValue) {
        suspension = newValue;
        System.out.println("Suspension ajusted to: " + suspension);

    }
}


