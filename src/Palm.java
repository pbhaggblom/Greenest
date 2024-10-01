public class Palm extends Plant implements WateringInstruction {

    public Palm(String name, double heightInMeters) {
        super(name, heightInMeters);
        this.setNutritionType(NutritionType.TAP_WATER);
        this.calculateAmountOfNutrition(heightInMeters);
    }

    @Override
    public void calculateAmountOfNutrition(double heightInMeters) {
        this.setAmountOfNutrition(0.5 * heightInMeters);
    }
}
