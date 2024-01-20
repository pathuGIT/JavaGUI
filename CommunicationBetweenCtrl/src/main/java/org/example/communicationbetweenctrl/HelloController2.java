package org.example.communicationbetweenctrl;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController2 {
    @FXML
    Label nameLabel;

    public void displayName(String name){
        nameLabel.setText("Hello "+name);
    }
}