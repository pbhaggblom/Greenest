public abstract class Plant {

    /*
    Kapslar in Plants instansvariabler genom att göra dem private,
    gör det lättare att kontrollera vilka värden som sätts genom
    getters och setters
     */
    private String name;
    private double heightInMeters;
    private double amountOfNutritionInLiters;
    //Använder enums för att ange vilken typ av näring växten ska ha
    private NutritionType nutritionType;

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

    public double getAmountOfNutritionInLiters() {
        return amountOfNutritionInLiters;
    }

    public void setAmountOfNutritionInLiters(double amountOfNutritionInLiters) {
        this.amountOfNutritionInLiters = amountOfNutritionInLiters;
    }

    @Override
    public abstract String toString();
}
