package session11.practice;

public abstract class Vehicle {
    private double speed;

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    private double getSpeed() {
        return speed;
    }

    public abstract void start();

    public final void stopping() {
        speed = 0;
    }
}

interface Safety {
    void airbags();

    void antiLockBreaks();
}


class Car extends Vehicle implements Safety {

    @Override
    public void start() {
        System.out.println("Start the engine");
    }

    @Override
    public void airbags() {

    }

    @Override
    public void antiLockBreaks() {

    }
}

class Bicycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Start bicycle");
    }
}

