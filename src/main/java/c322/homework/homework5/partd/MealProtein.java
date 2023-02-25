package c322.homework.homework5.partd;

public class MealProtein {
    private String protein;

    public MealProtein(String protein) {
        this.protein = protein;
    }

    public void addProtein() {
        System.out.println("Adding " + protein + " to meal.");
    }

    public String getProtein() {
        return protein;
    }

}
