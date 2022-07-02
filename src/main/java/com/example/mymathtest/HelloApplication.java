package com.example.mymathtest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static Map map;


    @Override
    public void start(Stage stage) {

        Button[] cell = new Button[map.size* map.size];
        Button b;
        for (int i = 0; i < map.size* map.size; i++)
        {
            cell[i] = new Button();
            cell[i].setText("");
            Button finalB = cell[i];
            cell[i].setOnAction(value -> {
                finalB.setVisible(false);
            });
        }

        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().addAll(cell);

       // Group group = new Group();
        Scene scene = new Scene(flowPane, map.size* map.size + 100, map.size* map.size + 100);
        stage.setTitle("Сапер v0.1");



        // System.out.println(map.size* map.size);


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