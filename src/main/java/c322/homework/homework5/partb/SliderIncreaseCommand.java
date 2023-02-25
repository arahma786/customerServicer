package c322.homework.homework5.partb;

public class SliderIncreaseCommand implements Command {
    private ControlBox controlBox;

    public SliderIncreaseCommand(ControlBox controlBox) {
        this.controlBox = controlBox;
    }

    @Override
    public void execute() {
        controlBox.sliderIncrease();
    }
}