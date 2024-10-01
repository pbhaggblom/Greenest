public class Cactus extends Plant {

    //Subklasserna till Plant ärver dess instansvariabler och metoder
    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
        this.setNutritionType(NutritionType.MINERAL_WATER);
        this.setAmountOfNutritionInLiters(0.02);
    }

    @Override
    public String toString() {
        return "Kaktusen " + this.getName();
    }
}