package Assignment3_000857238;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**This program draws the windows for the house*/
public class Window {
    /**Establishing constants*/
    private double x;
    private double y;
    private double diameter;

    /**Creating Window as constructor*/
    public Window(double x, double y, double diameter) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }
    /**Creating draw method for the window*/
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.SKYBLUE);
        gc.fillOval(x - diameter, y - diameter, 2 * diameter, 2 * diameter);
    }
}
