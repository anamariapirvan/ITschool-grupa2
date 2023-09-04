package session11.homework.smart_home_management_system.device_management;

import session11.homework.smart_home_management_system.Room;

public class Thermostat extends DeviceManagement {

    private int temperature; // The temperature set on the thermostat

    public Thermostat(String name, String type, boolean status, Room room) {
        super(name, type, status, room);
        this.temperature = 22;
    }

    @Override
    public void turnOn() {
        this.status = true;
    }

    @Override
    public void turnOff() {
        this.status = false;
    }

    // method to set the temperature as you like
    public void setTemperature(int newTemperature) {
        System.out.println(getName() + "temperature set to" + newTemperature);
    }

    //implement the code to obtain the current temperature on thermostat
    public int getTemperature() {
        return temperature;
    }

    // method to increase the temperature with one degree;
    public void increaseTemperature() {
        temperature++;
        System.out.println(getName() + " temperature increased to: " + temperature + " degree Celsius.");
    }

    public void decreaseTemperature() {
        temperature--;
        System.out.println(getName() + " temperature decreased to: " + temperature + " degree Celsius");
    }
}
