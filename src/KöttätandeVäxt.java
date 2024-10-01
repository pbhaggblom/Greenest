public class KöttätandeVäxt extends Växt implements DynamisktNäringsbehov {

    public KöttätandeVäxt(String namn, double höjdIMeter) {
        super(namn, höjdIMeter);
        this.setNäringstyp(Näringstyp.PROTEINDRYCK);
        this.kalkyleraNäringsmängd(höjdIMeter);
    }

    @Override
    public void kalkyleraNäringsmängd(double höjdIMeter) {
        this.setNäringsmängd(0.1 + (0.2 * höjdIMeter));
    }
}
