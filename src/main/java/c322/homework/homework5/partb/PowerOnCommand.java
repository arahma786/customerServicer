package c322.homework.homework5.partb;

public class PowerOnCommand implements Command {
    private ControlBox controlBox;

    public PowerOnCommand(ControlBox controlBox) {
        this.controlBox = controlBox;
    }

    @Override
    public void execute() {
        controlBox.powerOn();
    }
}

