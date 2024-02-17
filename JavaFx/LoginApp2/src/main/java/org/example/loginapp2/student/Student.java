package org.example.loginapp2.student;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;import javafx.fxml.FXML;

import javafx.stage.StageStyle;

import java.io.IOException;

public class Student {

    private Stage stage;
    private Scene scene;
    static int panel1Status = 1;


    public void loginToStudent(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("student.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("student.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    //Student MaenuBar Home Option
    public void PanelHome(Pane HomePanel){
        if(panel1Status == 1){
            HomePanel.setVisible(false);
            panel1Status = 0;
        }else{
            HomePanel.setVisible(true);
            panel1Status = 1;
        }
    }


}
