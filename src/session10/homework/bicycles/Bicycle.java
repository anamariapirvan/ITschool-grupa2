package session10.homework.bicycles;

public class Bicycle {

    private int speed;
    private int gear;

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void changeGear(int newGear){
        gear=newGear;
        System.out.println("Changed gear to: " + gear);
        System.out.println(gear);
    }

    public void speedUp(int increment){
        speed+=increment;
        System.out.println("The speed is incremented: " + increment);
        System.out.println(speed);
    }
    public void applyBrake(int decrement){
        speed-= decrement;
        System.out.println("The speed is decremented: " + decrement);
        System.out.println(speed);
    }
}
