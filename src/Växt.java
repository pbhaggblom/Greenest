public abstract class Växt {

    private String namn;
    private Växttyp typAvVäxt;
    private double höjdIMeter;
    private Näringstyp typAvNäring;

    public Växt(String namn, double höjdIMeter) {
        this.namn = namn;
        this.höjdIMeter = höjdIMeter;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public Växttyp getTypAvVäxt() {
        return typAvVäxt;
    }

    public void setTypAvVäxt(Växttyp typAvVäxt) {
        this.typAvVäxt = typAvVäxt;
    }

    public double getHöjdIMeter() {
        return höjdIMeter;
    }

    public void setHöjdIMeter(double höjdIMeter) {
        this.höjdIMeter = höjdIMeter;
    }

    public Näringstyp getTypAvNäring() {
        return typAvNäring;
    }

    public void setTypAvNäring(Näringstyp typAvNäring) {
        this.typAvNäring = typAvNäring;
    }
}
