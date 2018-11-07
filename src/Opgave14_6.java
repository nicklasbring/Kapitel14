/*(Game: display a checkerboard) Write a program that displays
a checkerboard in which each white and black cell is a
Rectangle with a fill color black or white,
as shown in Figure 14.44c.
*/
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.Scene;
import java.awt.*;
public class Opgave14_6 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
//Creating a Gridpane
        GridPane gPane = new GridPane();
//Creating a counter for printing WHITE-BLACK-WHITE-BLACK pattern
        int counter = 0;
//Creates our rectangles. with 8 rows and 8 columns
        for (int rows = 0; rows < 8; rows++) {
            for (int columns = 0; columns < 8; columns++) {
                Rectangle checkerRec = new Rectangle(50, 50);
                if (counter % 2 == 0) {
                    checkerRec.setFill(Color.BLACK);
                } else {
                    checkerRec.setFill(Color.WHITE);
                }
                gPane.add(checkerRec, columns, rows);
//Incrementing counter so it prints the opposite next time
                counter++;
            }
//Incremting counter so it prints the same as last, since we need the same two rectangles every 8 times
            counter++;
        }
//Creating the scene and placing it into the stage
        Scene scene = new Scene(gPane, 400, 400);
        primaryStage.setTitle("Checkerboard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
