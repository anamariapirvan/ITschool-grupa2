package session10.homework.bicycles;

public class Main{

    public static void main(String[] args) {
        MountainBike mountainBike= new MountainBike(200, 2, "Winter", 3);
        mountainBike.changeGear(3);
        mountainBike.speedUp(10);
        mountainBike.applyBrake(5);
        mountainBike.adjustSuspension(4);


    }
}
