package c322.homework.homework3.partc;

public abstract class SecurityControl implements HomeAutomationDevice{
    void arm() {
        System.out.println("SecurityControl is armed");
    }
    void disarm() {
        System.out.println("SecurityControl is disarmed");
    }
}
