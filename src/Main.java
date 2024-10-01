import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.List;

public class Main {

    public Main() {

        Plant igge = new Cactus("Igge", 0.2);
        Plant laura = new Palm("Laura", 5);
        Plant meatloaf = new CarnivorousPlant("Meatloaf", 0.7);
        Plant olof = new Palm("Olof", 1);

        //Polymorfism, objekt av de olika subklasserna läggs in i en Plant-lista
        List<Plant> plants = Arrays.asList(igge, laura, meatloaf, olof);

        while (true) {
            String input = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

            if (input == null) {
                break;
            }

            Plant currentPlant = null;

            for (Plant plant : plants) {
                if (plant.getName().equals(input)) {
                    currentPlant = plant;
                    break;
                }
            }

            if (currentPlant == null) {
                JOptionPane.showConfirmDialog(null, "Hittade ingen växt med angivet namn",
                                         "Greenest", JOptionPane.DEFAULT_OPTION);
                continue;
            }

            String name = currentPlant.getName();
            String nutritionType = currentPlant.getNutritionType().type;
            double amountOfNutrition = currentPlant.getAmountOfNutritionInLiters();

            int knapp = JOptionPane.showConfirmDialog(null, name + " ska få " + amountOfNutrition + " liter " + nutritionType,
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