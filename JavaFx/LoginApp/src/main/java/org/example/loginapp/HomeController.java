package org.example.loginapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class HomeController {
    @FXML
    private Label heLbl1;
    public void show(String uname) {
        heLbl1.setText("Hellow, " + uname);
    }
}
