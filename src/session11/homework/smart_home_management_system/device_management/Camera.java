package session11.homework.smart_home_management_system.device_management;

import session11.homework.smart_home_management_system.Room;

public class Camera extends DeviceManagement {

    boolean recording;

    public Camera(String name, String type, boolean status, Room room) {
        super(name, type, status, room);
        this.recording = false; // the camera is initially not recording;
    }

    @Override
    public void turnOn() {
        this.status = true;
    }

    @Override
    public void turnOff() {
        this.status = false;
    }


    public void startRecording() {
        this.recording = true;
    }

    public void stopRecording() {
        this.recording = false;
    }

    public boolean isRecording() {
        return recording;
    }
}
