package com.example.hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.RED);

//        Image img = new Image("icon.png");
//        stage.getIcons().add(img);

        stage.setTitle("Hello Samantha");
        stage.setWidth(600);
        stage.setHeight(600);
        stage.setResizable(false);

// For align stage
//        stage.setX(50);
//        stage.setY(50);

// For exit full screen
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Enter q for exit..");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.setScene(scene);
        stage.show();
    }
}