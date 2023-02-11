package c322.homework.homework3.partc;

public abstract class FaucetControl implements HomeAutomationDevice{
    void openValve() {
        System.out.println("FaucetControl valve is open");
    }
    void closeValve() {
        System.out.println("FaucetControl valve is closed");
    }
}
