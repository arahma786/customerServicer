package c322.homework.homework4.partc;

public class ConcreteMowerFactory implements MowerFactory{
    @Override
    public Mower getMowerType(String type) {
        switch (type) {
            case "Riding":
                return new RidingMower();
            case "Push":
                return new PushMower();
            default:
                throw new IllegalArgumentException("Invalid mower type: " + type);
        }
    }
}
