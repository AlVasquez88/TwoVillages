package Assignment3_000857238;
/**This program adds color and size to the houses
 * @author: Alvin Vasquez
 */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.util.Random;


public class Village {
    /**
     * Establishing constants
     */
    private double x;
    private double y;
    private double size;
    private Color color;
    private String name;
    private House house1;
    private House house2;
    private House house3;

    /**
     * Creating Village Constructor
     */
    public Village(double x, double y, Color color, String name) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.name = name;

        //Randomizing village sizes
        Random rand = new Random();
        int size1 = 50 + rand.nextInt(51);
        int size2 = 50 + rand.nextInt(51);
        int size3 = 50 + rand.nextInt(51);

        //Randomizing village occupants
        int occupants1 = 1 + rand.nextInt(20);
        int occupants2 = 1 + rand.nextInt(20);
        int occupants3 = 1 + rand.nextInt(20);

        int spacing = 20; // Increased spacing between houses

        house1 = new House(x, y - size1, size1, color, occupants1);
        house1.setOccupants(occupants1);
        house2 = new House(x + size1 + spacing, y - size2, size2, color, occupants2);
        house2.setOccupants(occupants2);
        house3 = new House(x + size1 + size2 + 2 * spacing, y - size3, size3, color, occupants3);
        house3.setOccupants(occupants3);
    }

    /**Creating draw method for the village*/
    public void draw(GraphicsContext gc) {
        house1.draw(gc);
        house2.draw(gc);
        house3.draw(gc);

        //village description
        int totalWidth = (int) (house1.getSize() + house2.getSize() + house3.getSize() + 40);
        int totalPopulation = house1.getOccupants() + house2.getOccupants() + house3.getOccupants();
        gc.setFill(Color.WHITE);
        gc.setFont(new Font(14));

        //text adjustments
        double textSpacingX = x;
        double textSpacingY = y + 40;
        gc.fillText(name + " - Size: " + totalWidth / 20 + "m - Population: " + totalPopulation, textSpacingX, textSpacingY);
    }
}