public class Cactus extends Plant {

    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
        this.setNutritionType(NutritionType.MINERAL_WATER);
        this.setAmountOfNutrition(0.02);
    }

}