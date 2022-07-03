package com.example.mymathtest;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    public static Map map;


    @Override
    public void start(Stage stage) {

        Button[] cell = new Button[map.size* map.size];
        Label[] cellLabel = new Label[map.size* map.size];
        Button b;


        Image bomb = new Image("C:\\Users\\bresk\\IdeaProjects\\myFirstProject\\src\\main\\resources\\600x600bf.png");

        ImageView[] views = new ImageView[map.size];
        for(int i = 0; i< map.size; i++)
        {
            views[i] = new ImageView(bomb);
        }
        int counterBombImage = 0;

        GridPane gridPane = new GridPane();
        for (int i = 0; i < map.size* map.size; i++)
        {


            if((map.map[i % map.size][i/map.size]) == map.GetNumBomb())
            {
                cellLabel[i] = new Label("");
                cellLabel[i].setGraphic(views[counterBombImage]);
                counterBombImage++;
            } else {
                cellLabel[i] = new Label(String.valueOf(map.map[i % map.size][i / map.size]));
            }
            cellLabel[i].setVisible(false);

            cell[i] = new Button();

            cell[i].setMinHeight(20.0);
            cell[i].setMinWidth(20.0);

            Button finalB = cell[i];
            gridPane.add(cell[i], i % map.size, i/map.size);
            gridPane.add(cellLabel[i], i % map.size, i/map.size);
            int finalI = i;
            cell[i].setOnAction(value -> {
                finalB.setVisible(false);
                cellLabel[finalI].setVisible(true);

            });
        }

        Scene scene = new Scene(gridPane, map.size*20, map.size*20);
        stage.setTitle("Сапер v0.1");

        stage.setScene(scene);
        stage.show();

    }



    public static void main(String[] args) {
        map = new Map(10);
        map.mapInit();
        map.printMap();

        launch();

    }
}