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
            String input = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?", "Greenest", JOptionPane.QUESTION_MESSAGE);
            if (input == null) {
                System.exit(0);
            }

            Plant currentPlant = findPlant(input, plants);

            if (currentPlant == null) {
                int notFoundButton = JOptionPane.showConfirmDialog(null,
                        "Hittade ingen växt med angivet namn",
                            "Greenest", JOptionPane.DEFAULT_OPTION);
                checkPressedButton(notFoundButton);
                continue;
            }

            int resultButton = JOptionPane.showConfirmDialog(null,
                    currentPlant.getName() + " ska få " +
                            currentPlant.getAmountOfNutritionInLiters() + " liter " +
                            currentPlant.getNutritionType().type,
                       "Greenest", JOptionPane.DEFAULT_OPTION);
            checkPressedButton(resultButton);
        }

    }

    public Plant findPlant(String plantName, List<Plant> plants) {
        Plant foundPlant = null;
        for (Plant plant : plants) {
            if (plant.getName().equalsIgnoreCase(plantName)) {
                foundPlant = plant;
                break;
            }
        }
        return foundPlant;
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