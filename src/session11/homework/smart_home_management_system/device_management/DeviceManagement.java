package session11.homework.smart_home_management_system.device_management;

import session11.homework.smart_home_management_system.Room;

public abstract class DeviceManagement {
    private String name;
    private String type;
    boolean status;
    private Room room;

    public DeviceManagement(String name, String type, boolean status, Room room) {
        this.name = name;
        this.type = type;
        this.status = false; // Device is initially turned off
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public abstract void turnOn(); // abstract method for turning the device on

    public abstract void turnOff(); // abstract method for turning the device off
}
