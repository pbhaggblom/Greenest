public enum NutritionType {

    TAP_WATER("kranvatten"),
    PROTEIN_DRINK("proteindryck"),
    MINERAL_WATER("mineralvatten");

    public final String type;

    NutritionType(String type) {
        this.type = type;
    }
}
