package org.example.scenebuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle myCircle;
    private double x;
    private double y;
    public void up(ActionEvent e){
       //System.out.println("UP");
        myCircle.setCenterY(y-=1);
    }
    public void right(ActionEvent e){
        //System.out.println("Right");
        myCircle.setCenterX(x+=1);
    }
    public void down(ActionEvent e){
        //System.out.println("down");
        myCircle.setCenterY(y+=1);
    }
    public void left(ActionEvent e){
        //System.out.println("left");
        myCircle.setCenterX(x-=1);
    }
}
