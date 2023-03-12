package c322.homework.homework7.parta;

public class Off extends RemoteControl{//use ipmlements for interfaces and extend for classes
    @Override
    public void pressSwitch(TV context) {
        System.out.println("Tv is off");
        context.setState(this);
    }
}
