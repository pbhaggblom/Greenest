public class Kaktus extends Växt {

    public Kaktus(String namn, double höjdIMeter) {
        super(namn, höjdIMeter);
        this.setNäringstyp(Näringstyp.MINERALVATTEN);
        this.setNäringsmängd(0.02);
    }

}