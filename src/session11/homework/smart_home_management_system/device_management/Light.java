package session11.homework.smart_home_management_system.device_management;

import session11.homework.smart_home_management_system.Room;

public class Light extends DeviceManagement {

    int brightness;

    public Light(String name, String type, boolean status, Room room) {
        super(name, type, status, room);
        this.brightness = 0; // the light is off
    }

    @Override
    public void turnOn() {
        this.status = true;
        this.brightness = 100;
    }


    @Override
    public void turnOff() {
        this.status = false;
        this.brightness = 0;
    }
}
