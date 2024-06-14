package Assignment3_000857238;
/**This program draws the building for the village.
 * @Author: Alvin Vasquez
 * @version: TwoVillages.java
 */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class House {
    private final Door door;
    private final Window window;
    /**Establishing constants*/
    private double x;
    private double y;
    private double size;
    private Color color;
    private int occupants;

    /**Creating House as Constructor*/
    public House(double x, double y, double size, Color color, int occupants) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        this.occupants = occupants;
        this.door = new Door(x + size / 3, y + size/ 1.14, size / 8);
        this.window = new Window(x + 2 * size / 3, y + size / 3, size / 6);
        setOccupants(occupants);
    }
    /**Creating the King's palace as an overloaded constructor*/
    public House(Door door, Window window, double x, double y) {
        this.door = door;
        this.window = window;
        this.x = x;
        this.y = y;
        this.occupants = 1;
        //For some reason, I was unable to figure out why I can't use this constructor. Am I missing somthing?
    }

    /**Creating draw method for the house*/
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.web(String.valueOf(color)));
        gc.fillRect(x,y,size,size);
        door.draw(gc);
        window.draw(gc);
    }

    //Creating getOccupants method
    public int getOccupants() {
        return occupants;
    }
    //Creating setOccupants method
    public int setOccupants(int n){
        return occupants;
    }
    //Creating getSize method
    public double getSize(){
        return size;
    }
}
