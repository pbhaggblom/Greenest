public class Kaktus extends Växt {

    public Kaktus(String namn, double höjdIMeter) {
        this.setNamn(namn);
        this.setTypAvVäxt(Växttyp.KAKTUS);
        this.setHöjdIMeter(höjdIMeter);
        this.setTypAvNäring(Näringstyp.MINERALVATTEN);
    }

}