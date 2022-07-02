package com.example.mymathtest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static Map map;


    @Override
    public void start(Stage stage) throws IOException {

       FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), map.size* map.size + 100, map.size* map.size + 100);
        stage.setTitle("Сапер v0.1");
        Button[] cell = new Button[map.size* map.size];

        System.out.println(map.size* map.size);


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