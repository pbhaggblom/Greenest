public class Palm extends Växt {

    public Palm(String namn, double höjdIMeter) {
        super(namn, höjdIMeter);
        this.setTypAvVäxt(Växttyp.PALM);
        this.setTypAvNäring(Näringstyp.KRANVATTEN);
    }
}
