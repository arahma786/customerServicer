package c322.homework.homework3.partc;

public class CeilingLight implements HomeAutomationDevice{
    public void on() {
        System.out.println("Ceiling light is on");
    }
    public void off() {
        System.out.println("Ceiling light is off");
    }
    void dim() {
        System.out.println("Ceiling light is dimmed");
    }
}
