package c322.homework.homework3.partc;

public abstract class CeilingFan implements HomeAutomationDevice{
    void high() {
        System.out.println("Ceiling fan is on high");
    }
    void medium() {
        System.out.println("Ceiling fan is on medium");
    }
    void low() {
        System.out.println("Ceiling fan is on low");
    }
    public void off() {
        System.out.println("Ceiling fan is off");
    }
    int getSpeed() {
        System.out.println("Ceiling fan speed is checked");
        return 0;
    }
}
