package c322.homework.homework3.partc;

public class TV implements HomeAutomationDevice{
    public void on() {
        System.out.println("TV is on");
    }
    public void off() {
        System.out.println("TV is off");
    }
    void setInputChannel(int channel) {
        System.out.println("TV input channel set to " + channel);
    }
    void setVolume(int volume) {
        System.out.println("TV volume set to " + volume);
    }
}
