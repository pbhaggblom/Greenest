public class Kaktus extends Växt {

    public Kaktus(String namn, double höjdIMeter) {
        super(namn, höjdIMeter);
        this.setVäxttyp(Växttyp.KAKTUS);
        this.setNäringstyp(Näringstyp.MINERALVATTEN);
        this.setNäringsmängd(0.02);
    }

}