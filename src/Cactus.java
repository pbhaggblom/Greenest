public class Cactus extends Plant {

    //Subklasserna till Plant ärver dess instansvariabler, metoder och konstruktorer
    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
        this.setNutritionType(NutritionType.MINERAL_WATER);
        this.setAmountOfNutritionInLiters(0.02);
    }

}