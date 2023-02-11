package c322.homework.homework3.partc;

public abstract class Thermostat implements HomeAutomationDevice{
    void setTemperature(int temperature) {
        System.out.println("Thermostat temperature set to " + temperature);
    }
}
