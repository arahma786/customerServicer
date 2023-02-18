package c322.homework.homework4.partd;

public class TypeBFactory extends MotorHomeAbstractFactory{
    @Override
    public Type createType() {
        return new TypeB();
    }

    @Override
    public Style createStyle() {
        return new TypeBStyle();
    }

    @Override
    public Frame createFrame() {
        return new TypeBFrame();
    }

    @Override
    public Engine createEngine() {
        return new TypeBEngine();
    }

    @Override
    public Kitchen createKitchen() {
        return new TypeBKitchen();
    }
}
