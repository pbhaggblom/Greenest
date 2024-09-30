public abstract class Växt {

    private String namn;
    private Växttyp typAvVäxt;
    private double höjdIMeter;
    private Näringstyp typAvNäring;
    private double näringsmängd;

    public Växt(String namn, double höjdIMeter) {
        this.namn = namn;
        this.höjdIMeter = höjdIMeter;
    }

    public String getNamn() {
        return namn;
    }

    public void setTypAvVäxt(Växttyp typAvVäxt) {
        this.typAvVäxt = typAvVäxt;
    }

    public double getHöjdIMeter() {
        return höjdIMeter;
    }

    public Näringstyp getTypAvNäring() {
        return typAvNäring;
    }

    public void setTypAvNäring(Näringstyp typAvNäring) {
        this.typAvNäring = typAvNäring;
    }

    public double getNäringsmängd() {
        return näringsmängd;
    }

    public void setNäringsmängd(double näringsmängd) {
        this.näringsmängd = näringsmängd;
    }
}
