import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.List;

public class Main {

    public Main() {

        Plant igge = new Cactus("Igge", 0.2);
        Plant laura = new Palm("Laura", 5);
        Plant meatloaf = new CarnivorousPlant("Meatloaf", 0.7);
        Plant olof = new Palm("Olof", 1);

        List<Plant> plants = Arrays.asList(igge, laura, meatloaf, olof);

        while (true) {
            String plantName = JOptionPane.showInputDialog(null,
                    "Vilken växt ska få vätska?",
                    "Greenest", JOptionPane.QUESTION_MESSAGE);
            if (plantName == null) {
                System.exit(0);
            }

            Plant currentPlant = findPlant(plantName, plants);

            if (currentPlant == null) {
                int notFoundButton = JOptionPane.showConfirmDialog(null,
                        "Hittade ingen växt med angivet namn",
                        "Greenest", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                checkPressedButton(notFoundButton);
                continue;
            }

            /*
            Polymorfism: currentPlants toString-metod körs här och ger olika utskrift beroende på
            vilken typ av växt den är
             */
            int resultButton = JOptionPane.showConfirmDialog(null, currentPlant + " ska få " +
                            currentPlant.getAmountOfNutritionInLiters() + " liter " +
                            currentPlant.getNutritionType().type, "Greenest", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
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

    public void checkPressedButton(int pressedButton) {
        if (pressedButton != JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}