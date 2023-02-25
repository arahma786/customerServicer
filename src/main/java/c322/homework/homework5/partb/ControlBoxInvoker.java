package c322.homework.homework5.partb;

public class ControlBoxInvoker {
    private Command powerOnCommand;
    private Command powerOffCommand;
    private Command sliderIncreaseCommand;
    private Command sliderDecreaseCommand;

    public ControlBoxInvoker(Command powerOnCommand, Command powerOffCommand, Command sliderIncreaseCommand, Command sliderDecreaseCommand) {
        this.powerOnCommand = powerOnCommand;
        this.powerOffCommand = powerOffCommand;
        this.sliderIncreaseCommand = sliderIncreaseCommand;
        this.sliderDecreaseCommand = sliderDecreaseCommand;
    }

    public void powerOn() {
        powerOnCommand.execute();
    }

    public void powerOff() {
        powerOffCommand.execute();
    }

    public void sliderIncrease() {
        sliderIncreaseCommand.execute();
    }

    public void sliderDecrease() {
        sliderDecreaseCommand.execute();
    }
}


