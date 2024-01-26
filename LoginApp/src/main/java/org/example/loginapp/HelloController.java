package org.example.loginapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label errorid;
    @FXML
    private TextField username;
    @FXML
    private PasswordField userpwd;



    public void login() throws IOException {
        if(username.getText().equals("lakshan") && userpwd.getText().equals("pwd")){

            //Switch to the home fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
            Parent root = loader.load();

            HomeController obj = loader.getController();
            obj.show(username.getText());


            Stage stage = (Stage) username.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle("Login");
            stage.setScene(scene);
            stage.show();
        }else{
            errorid.setText("Login Failed.");
        }
    }
}