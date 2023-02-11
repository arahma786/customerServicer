package c322.homework.homework3.partc;

public abstract class Sprinkler implements HomeAutomationDevice{
    void waterOn() {
        System.out.println("Sprinkler water is on");
    }
    void waterOff() {
        System.out.println("Sprinkler water is off");
    }
}
