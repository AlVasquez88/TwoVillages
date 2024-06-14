package Assignment3_000857238;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**This program simulates two villages and the Emperor's house.
 * @author: Alvin Vasquez, 000857238
 * @version: TwoVillages.java
 * Created: 6/13/2024
 */



public class TwoVillages extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        /**Establishing Canvas*/
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(1000,800); // Canvas Size(pixels)
        stage.setTitle("TwoVillages");
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        /**Background*/
        gc.setFill(Color.DARKGREEN);
        gc.fillRect(0,0,1000,800);

        /**Simulating the villages and the Emperor's House*/
        Village village1 = new Village(50, 700, Color.BLUE, "Whiterun");
        Village village2 = new Village(500, 700, Color.RED, "Riverwood");
        House kingsHouse = new House(400, 100, 150, Color.ORANGERED,1);

        village1.draw(gc);
        village2.draw(gc);
        kingsHouse.draw(gc);

        //stopping code
        stage.show();
    }
/**Actual main method to launch the app.*/
public static void main(String[] args) {
    launch(args);
}
}
