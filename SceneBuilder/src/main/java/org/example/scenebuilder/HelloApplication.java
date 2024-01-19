package org.example.scenebuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


        @Override
        public void start(Stage primartyStage) throws IOException {
            try{
                Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
                Scene scene = new Scene(root,600,600);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();

            } catch(Exception e){
                e.printStackTrace();
            }
    }


    public static void main(String[] args) {
        launch();
    }
}