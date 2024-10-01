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

            if (input == null) {
                break;
            }

            Växt aktuellVäxt = null;

            for (Växt växt : växter) {
                if (växt.getNamn().equals(input)) {
                    aktuellVäxt = växt;
                    System.out.println(aktuellVäxt.getNäringstyp().typ);
                    break;
                }
            }

            if (aktuellVäxt == null) {
                JOptionPane.showConfirmDialog(null, "Hittade ingen växt med angivet namn",
                                         "Greenest", JOptionPane.DEFAULT_OPTION);
                continue;
            }

            String namn = aktuellVäxt.getNamn();
            String näringstyp = aktuellVäxt.getNäringstyp().typ;
            double näringsmängd = aktuellVäxt.getNäringsmängd();

            int knapp = JOptionPane.showConfirmDialog(null, namn + " ska få " + näringsmängd + " liter " + näringstyp,
                                                 "Greenest", JOptionPane.DEFAULT_OPTION);

            if (knapp != JOptionPane.OK_OPTION) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}