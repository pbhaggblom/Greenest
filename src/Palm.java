public class Palm extends Växt implements DynamisktNäringsbehov {

    public Palm(String namn, double höjdIMeter) {
        super(namn, höjdIMeter);
        this.setTypAvVäxt(Växttyp.PALM);
        this.setTypAvNäring(Näringstyp.KRANVATTEN);
        this.setNäringsmängd(höjdIMeter);
    }

    @Override
    public double kalkyleraNäringsmängd(double höjdIMeter) {
        return 0.5 * höjdIMeter;
    }
}
