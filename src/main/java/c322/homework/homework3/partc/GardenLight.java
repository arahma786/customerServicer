package c322.homework.homework3.partc;

public abstract class GardenLight implements HomeAutomationDevice{
    void setDuskTime() {
        System.out.println("Garden light dusk time is set");
    }
    void setDawnTime() {
        System.out.println("Garden light dawn time is set");
    }
    void manualOn() {
        System.out.println("Garden light is manually turned on");
    }
    void manualOff() {
        System.out.println("Garden light is manually turned off");
    }
}
