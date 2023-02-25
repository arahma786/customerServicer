package c322.homework.homework5.partd;

import java.util.ArrayList;


public class MealFacade {
    private ArrayList<MealProtein> proteins;
    private ArrayList<MealVegetable> vegetables;
    private ArrayList<MealStarch> starches;
public  MealFacade() {

        this.proteins = new ArrayList<MealProtein>();
        this.vegetables = new ArrayList<MealVegetable>();
        this.starches = new ArrayList<MealStarch>();
    }

    public void addProtein(MealProtein protein) {
        this.proteins.add(protein);
    }

    public void addVegetable(MealVegetable vegetable) {
        this.vegetables.add(vegetable);
    }

    public void addStarch(MealStarch starch) {
        this.starches.add(starch);
    }

    public void assembleMeal(String protein, String vegetable, String starch) {
        System.out.println("\n===============================================");
        System.out.println("Meal Assembly Service Demo");
        System.out.println("===============================================");
        System.out.println("Meal assembly process");
        MealProtein mealProtein = new MealProtein(protein);
        mealProtein.addProtein();

        MealVegetable mealVegetable = new MealVegetable(vegetable);
        mealVegetable.addVegetable();

        MealStarch mealStarch = new MealStarch(starch);
        mealStarch.addStarch();

        System.out.println("Meal assembly process completed. . .");



    }
}
