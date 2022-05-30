package com.example.mymathtest;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label welcomeText;
    private final int questsSize = 6;


    @FXML
    protected void onHelloButtonClick() throws IOException {
        FileWork fileWork = new FileWork();
        int i = (int)(Math.random() *  questsSize + 1);
        welcomeText.setText(fileWork.TakeNumStr(i));
    }
}