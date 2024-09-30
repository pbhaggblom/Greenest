public class KöttätandeVäxt extends Växt implements DynamisktNäringsbehov {

    public KöttätandeVäxt(String namn, double höjdIMeter) {
        super(namn, höjdIMeter);
        this.setTypAvVäxt(Växttyp.KÖTTÄTANDE_VÄXT);
        this.setTypAvNäring(Näringstyp.PROTEINDRYCK);
    }

    @Override
    public double kalkyleraNäringsmängd(double höjdIMeter) {
        return 0.1 + (0.2 * höjdIMeter);
    }
}
