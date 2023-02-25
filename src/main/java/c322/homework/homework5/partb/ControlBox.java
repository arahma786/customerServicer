package c322.homework.homework5.partb;

public class ControlBox {
    public static final int SLIDER_MIN = 0;
    public static final int SLIDER_MAX = 100;

    private boolean poweredOn;
    private int sliderValue;

    public ControlBox() {
        poweredOn = false;
        sliderValue = SLIDER_MIN;
    }

    public int getSliderValue() {
        return sliderValue;
    }

    public boolean hasPower() {
        return poweredOn;
    }

    public void powerOn() {
        poweredOn = true;
    }

    public void powerOff() {
        poweredOn = false;
    }

    public void sliderIncrease() {
        if (sliderValue < SLIDER_MAX) {
            sliderValue++;
        }
    }

    public void sliderDecrease() {
        if (sliderValue > SLIDER_MIN) {
            sliderValue--;
        }
    }
}
