package session11.homework.smart_home_management_system.device_management;

import session11.homework.smart_home_management_system.Room;

public class Door extends DeviceManagement {
    boolean locked;

    public Door(String name, String type, boolean status, Room room) {
        super(name, type, status, room);
        this.locked = false; // door is initially locked
    }

    @Override
    public void turnOn() {
        this.status = true;
    }

    @Override
    public void turnOff() {
        this.status = false;
    }

    public void lock() {
        this.locked = true;
    }

    public void unlocked() {
        this.locked = false;
    }

    public boolean isLocked() {
        return locked;
    }
}
