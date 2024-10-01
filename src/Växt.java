public abstract class Växt {

    private String namn;
    private Växttyp växttyp;
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

    public void setVäxttyp(Växttyp växttyp) {
        this.växttyp = växttyp;
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
