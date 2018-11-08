package Opgave14_8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Collections;

public class Opgave14_8 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane gPane = new GridPane();
        int count = 0;
        ArrayList<Integer> cards = new ArrayList<>();


        fillArray(cards);
        Collections.shuffle(cards);


        //Double for loop. gives 9 rows and 6 columns. total of 54.
        for (int row = 0 ; row < 9 ; row++ ){
            for (int column = 0 ; column < 6 ; column++){

                Image cardsPath = new Image("Opgave14_8/card/" + cards.get(count) + ".png");

                ImageView image = new ImageView(cardsPath);
                image.setFitHeight(60);
                image.setFitWidth(45);


                gPane.add(image, column, row);

                count++;
            }
        }


        Scene scene = new Scene(gPane , 270 , 540);
        primaryStage.setTitle("Playing cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public void fillArray(ArrayList<Integer> cards){
        for (int ammount = 1 ; ammount <= 54 ; ammount++){
            cards.add(ammount);
        }


    }
}
