package c322.homework.homework7.parta;

public class On extends RemoteControl{//use ipmlements for interfaces and extend for classes
    @Override
    public void pressSwitch(TV context) {
        System.out.println("Tv is on");
        context.setState(this);
    }
}
