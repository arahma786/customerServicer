package c322.homework.homework3.partc;

public abstract class Hottub implements HomeAutomationDevice{
    void circulate() {
        System.out.println("Hottub is circulating");
    }
    void jetsOn() {
        System.out.println("Hottub jets are on");
    }
    void jetsOff() {
        System.out.println("Hottub jets are off");
    }
    void setTemperature(int temperature) {
        System.out.println("Hottub temperature set to " + temperature);
    }
}
