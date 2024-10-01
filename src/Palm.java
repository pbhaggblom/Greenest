public class Palm extends Växt implements DynamisktNäringsbehov {

    public Palm(String namn, double höjdIMeter) {
        super(namn, höjdIMeter);
        this.setNäringstyp(Näringstyp.KRANVATTEN);
        this.kalkyleraNäringsmängd(höjdIMeter);
    }

    @Override
    public void kalkyleraNäringsmängd(double höjdIMeter) {
        this.setNäringsmängd(0.5 * höjdIMeter);
    }
}
