package session10.homework.water_craft;

public class Main {

    public static void main(String[] args) {
        SpeedBoat speedBoat= new SpeedBoat();
        FishingBoat fishingBoat=new FishingBoat();

        speedBoat.sail();
        speedBoat.turboBoost();

        fishingBoat.sail();
        fishingBoat.castNet();
    }
}
