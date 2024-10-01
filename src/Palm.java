public class Palm extends Plant implements Calculable {

    public Palm(String name, double heightInMeters) {
        super(name, heightInMeters);
        this.setNutritionType(NutritionType.TAP_WATER);
        this.calculateAmountOfNutrition(heightInMeters);
    }

    @Override
    public String toString() {
        return "Palmen " + this.getName();
    }

    /*
    Växter som har en specifik formel för att räkna ut
    bevattningen implementerar interfacet WateringInstruction
     */
    @Override
    public void calculateAmountOfNutrition(double heightInMeters) {
        this.setAmountOfNutritionInLiters(0.5 * heightInMeters);
    }
}
