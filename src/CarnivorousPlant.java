public class CarnivorousPlant extends Plant implements Calculable {

    public CarnivorousPlant(String name, double heightInMeters) {
        super(name, heightInMeters);
        this.setNutritionType(NutritionType.PROTEIN_DRINK);
        this.calculateAmountOfNutrition(heightInMeters);
    }

    @Override
    public String toString() {
        return "Köttätande växten " + this.getName();
    }

    @Override
    public void calculateAmountOfNutrition(double heightInMeters) {
        this.setAmountOfNutritionInLiters(0.1 + (0.2 * heightInMeters));
    }
}
