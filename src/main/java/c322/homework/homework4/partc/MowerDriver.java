package c322.homework.homework4.partc;

public class MowerDriver {
    public static void main(String[] args) {
        // output header
        System.out.println("\n\nMOWER SELECTION HELPER");

        // create mower factory
        MowerFactory mowerFactory = new ConcreteMowerFactory();

        // create a riding mower
        Mower rideIt = mowerFactory.getMowerType("Riding");
        rideIt.mow();

        // create a push mower
        Mower pushIt = mowerFactory.getMowerType("Push");
        pushIt.mow();

    }
}
