package c322.homework.homework4.partd;

public abstract class MotorHomeAbstractFactory {
    abstract Type createType();
    abstract Style createStyle();
    abstract Frame createFrame();
    abstract Engine createEngine();
    abstract Kitchen createKitchen();
}
