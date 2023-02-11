package c322.homework.homework3.partc;

public abstract class GarageDoor implements HomeAutomationDevice {
    void up() {
        System.out.println("Garage door is up");
    }

    void down() {
        System.out.println("Garage door is down");
    }

    void stop() {
        System.out.println("Garage door is stopped");
    }

    void lightOn() {
        System.out.println("Garage door light is on");
    }

    void lightOff() {
        System.out.println("Garage door light is off");
    }
}

