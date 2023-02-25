package c322.homework.homework5.partb;

public class SliderDecreaseCommand implements Command {
    private ControlBox controlBox;

    public SliderDecreaseCommand(ControlBox controlBox) {
        this.controlBox = controlBox;
    }

    @Override
    public void execute() {
        controlBox.sliderDecrease();
    }
}