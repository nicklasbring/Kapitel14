package Opgave14_8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.InputStream;

public class Opgave14_8 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane gPane = new GridPane();
        int count = 0;




        //Double for loop. gives 9 rows and 6 columns. total of 54.
        for (int row = 0 ; row < 9 ; row++ ){
            for (int column = 0 ; column < 6 ; column++){

                Image cardsPath = new Image("Cards/" + (count) + ".png");

                ImageView image = new ImageView(cardsPath);

                gPane.add(image, column, row);



            count++;
            row++;

        }
        }


        Scene scene = new Scene(gPane, 400, 400);
        primaryStage.setTitle("Checkerboard");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
