package org.example.communicationbetweenctrl;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class HelloController1{
    @FXML
    Label lbl1;
    public void genNum(){
        //System.out.println("Hi");
        Random rnd = new Random();
        int value = rnd.nextInt(50);
        lbl1.setText(Integer.toString(value));
    }
}