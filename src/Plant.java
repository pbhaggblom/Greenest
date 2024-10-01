public abstract class Plant {

    private String name;
    private double heightInMeters;
    private NutritionType nutritionType;
    private double amountOfNutrition;

    public Plant(String name, double heightInMeters) {
        this.name = name;
        this.heightInMeters = heightInMeters;
    }

    public String getName() {
        return name;
    }

    public NutritionType getNutritionType() {
        return nutritionType;
    }

    public void setNutritionType(NutritionType nutritionType) {
        this.nutritionType = nutritionType;
    }

    public double getAmountOfNutrition() {
        return amountOfNutrition;
    }

    public void setAmountOfNutrition(double amountOfNutrition) {
        this.amountOfNutrition = amountOfNutrition;
    }
}
