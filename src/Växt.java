public abstract class Växt {

    private String namn;
    private double höjdIMeter;
    private Näringstyp näringstyp;
    private double näringsmängd;

    public Växt(String namn, double höjdIMeter) {
        this.namn = namn;
        this.höjdIMeter = höjdIMeter;
    }

    public String getNamn() {
        return namn;
    }

    public double getHöjdIMeter() {
        return höjdIMeter;
    }

    public Näringstyp getNäringstyp() {
        return näringstyp;
    }

    public void setNäringstyp(Näringstyp näringstyp) {
        this.näringstyp = näringstyp;
    }

    public double getNäringsmängd() {
        return näringsmängd;
    }

    public void setNäringsmängd(double näringsmängd) {
        this.näringsmängd = näringsmängd;
    }
}
