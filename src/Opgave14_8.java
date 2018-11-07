import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Opgave14_8 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane gPane = new GridPane();



        //Double for loop. gives 9 rows and 6 columns. total of 54.
        for (int row = 0 ; row < 9 ; row++ ){
            for (int column = 0 ; column < 6 ; column++){
                gPane.add(new ImageView(new Image("")));


            }
        }

    }
}
