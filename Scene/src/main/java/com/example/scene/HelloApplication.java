package com.example.scene;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primartyStage) throws IOException {

        Group root = new Group();
        Scene scene = new Scene(root,600,600, Color.GREEN);
        Stage stage = new Stage();
        stage.setTitle("Scence Application");

        //For text
        Text text = new Text();
        text.setText("Hi friends..");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.BLACK);

        //for line
        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        line.setRotate(45);

        //for rectangle
        Rectangle rect = new Rectangle();
        rect.setX(100);
        rect.setY(100);
        rect.setWidth(100);
        rect.setHeight(100);
        rect.setFill(Color.YELLOW);
        rect.setStrokeWidth(2);
        rect.setStroke(Color.BLACK);

        //for triangle
        Polygon traingle = new Polygon();
        traingle.getPoints().setAll(
                200.00,200.0,
                300.0,300.0,
                200.0,300.0
        );
        traingle.setFill(Color.BLUE);

        //for circle
        Circle cir = new Circle();
        cir.setCenterX(350);
        cir.setCenterY(350);
        cir.setRadius(20);


        root.getChildren().add(cir);
        root.getChildren().add(traingle);
        root.getChildren().add(rect);
        root.getChildren().add(text);
        root.getChildren().add(line);
        stage.setScene(scene);
        stage.show();
    }
}