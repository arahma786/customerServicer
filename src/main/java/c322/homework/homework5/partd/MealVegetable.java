package c322.homework.homework5.partd;

public class MealVegetable {
    private String vegetable;

    public MealVegetable(String vegetable) {
        this.vegetable = vegetable;
    }

    public String getVegetable() {
        return vegetable;
    }

    public void addVegetable() {
        System.out.println("Adding " + vegetable + " to the meal.");
    }
}