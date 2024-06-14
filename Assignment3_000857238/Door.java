package Assignment3_000857238;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**This program draws the door of the house
 * @author Alvin Vasquez
 * @version: TwoVillages.java
 */

public class Door {
    /**Establishing constants*/
    private double x;
    private double y;
    private double height;

    /**Creating constructor for Door*/
    public Door(double x, double y, double height){
        this.x = x;
        this.y = y;
        this.height = height;
    }

    /**Creating draw method for the door*/
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.BURLYWOOD);
        gc.fillRect(x - height, y - height, 2 * height, 2 * height);
    }
}