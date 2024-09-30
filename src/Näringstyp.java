public enum Näringstyp {

    KRANVATTEN ("kranvatten"),
    PROTEINDRYCK ("proteindryck"),
    MINERALVATTEN ("mineralvatten");

    public final String typ;

    private Näringstyp(String typ) {
        this.typ = typ;
    }
}
