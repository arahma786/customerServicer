package c322.homework.homework5.partd;

public class MealStarch {
    private String starch;

    public MealStarch(String starch) {
        this.starch = starch;
    }

    public String getStarch() {
        return starch;
    }

    public void addStarch() {
        System.out.println("Adding " + starch + " to the meal.");
    }
}