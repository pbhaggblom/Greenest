public class KöttätandeVäxt extends Växt {

    public KöttätandeVäxt(String namn, double höjdIMeter) {
        super(namn, höjdIMeter);
        this.setTypAvVäxt(Växttyp.KÖTTÄTANDE_VÄXT);
        this.setTypAvNäring(Näringstyp.PROTEINDRYCK);
    }

}
