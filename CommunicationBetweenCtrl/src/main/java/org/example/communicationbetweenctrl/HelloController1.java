package org.example.communicationbetweenctrl;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController1 {
    @FXML
    TextField nameTextFeild;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event)throws IOException {

        String uname = nameTextFeild.getText();
        //root = FXMLLoader.load(getClass().getResource("hello-view2.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view2.fxml"));
        root = loader.load();

        HelloController2 hello2ctrl = new HelloController2();
        hello2ctrl.displayName(uname);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}