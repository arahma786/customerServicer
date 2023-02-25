package c322.homework.homework5.partb;

public class PowerOffCommand implements Command {
    private ControlBox controlBox;

    public PowerOffCommand(ControlBox controlBox) {
        this.controlBox = controlBox;
    }

    @Override
    public void execute() {
        controlBox.powerOff();
    }
}
