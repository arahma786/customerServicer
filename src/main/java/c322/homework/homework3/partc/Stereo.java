package c322.homework.homework3.partc;

public class Stereo implements HomeAutomationDevice{
    public void on() {
        System.out.println("Stereo is on");
    }
    public void off() {
        System.out.println("Stereo is off");
    }
    void setCd() {
        System.out.println("Stereo set to CD");
    }
    void setDvd() {
        System.out.println("Stereo set to DVD");
    }
    void setRadio() {
        System.out.println("Stereo set to Radio");
    }
    void setVolume(int volume) {
        System.out.println("Stereo volume set to " + volume);
    }
}
