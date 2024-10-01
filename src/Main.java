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
                System.exit(0);
            }

            Plant currentPlant = null;
            for (Plant plant : plants) {
                if (plant.getName().equalsIgnoreCase(input)) {
                    currentPlant = plant;
                    break;
                }
            }

            if (currentPlant == null) {
                int pressedButton = JOptionPane.showConfirmDialog(null, "Hittade ingen växt med angivet namn",
                                         "Greenest", JOptionPane.DEFAULT_OPTION);
                checkPressedButton(pressedButton);
                continue;
            }

            String name = currentPlant.getName();
            String nutritionType = currentPlant.getNutritionType().type;
            double amountOfNutrition = currentPlant.getAmountOfNutritionInLiters();

            int pressedButton = JOptionPane.showConfirmDialog(null, name + " ska få " + amountOfNutrition + " liter " + nutritionType,
                                                 "Greenest", JOptionPane.DEFAULT_OPTION);
            checkPressedButton(pressedButton);
        }

    }

    public void checkPressedButton(int i) {
        if (i != JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}