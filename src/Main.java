import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.List;

public class Main {

    public Main() {

        Växt igge = new Kaktus("Igge", 0.2);
        Växt laura = new Palm("Laura", 5);
        Växt meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);
        Växt olof = new Palm("Olof", 1);

        List<Växt> växter = Arrays.asList(igge, laura, meatloaf, olof);

        while (true) {
            String input = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

            Växt aktuellVäxt = null;

            for (Växt växt : växter) {
                if (växt.getNamn().equals(input)) {
                    aktuellVäxt = växt;
                    System.out.println(aktuellVäxt.getTypAvNäring().typ);
                    break;
                }
            }

            if (aktuellVäxt == null) {
                JOptionPane.showMessageDialog(null, "Hittade ingen växt med angivet namn");
                continue;
            }

            String namn = aktuellVäxt.getNamn();
            String näringstyp = aktuellVäxt.getTypAvNäring().typ;
            double näringsmängd = 0;

            if (aktuellVäxt instanceof DynamisktNäringsbehov) {
                DynamisktNäringsbehov växt = (DynamisktNäringsbehov) aktuellVäxt;
                näringsmängd = växt.kalkyleraNäringsmängd(aktuellVäxt.getHöjdIMeter());
            } else {
                näringsmängd = aktuellVäxt.getNäringsmängd();
            }

            JOptionPane.showMessageDialog(null, namn + " ska få " + näringsmängd + " liter " + näringstyp);
        }

    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}