package org.example.communicationbetweenctrl;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class HelloController1{
    @FXML
    Label lbl1;
    @FXML
    private TextField input1;
    @FXML
    private TextField input2;


    public void genNum(){
        try{
            String min = input1.getText();
            String max = input2.getText();
            int Min = Integer.parseInt(min);
            int Max = Integer.parseInt(max);

            if (min.isEmpty() || max.isEmpty()) {

                lbl1.setText("Please enter values for both Min and Max.");
                System.out.println("empty");

            }else{

                Random rnd = new Random();
                int value = rnd.nextInt(Max - Min +1) + Min;
                lbl1.setText(Integer.toString(value));
            }

        }catch(NumberFormatException e){
            System.out.println("Wrong");
            lbl1.setText("Min & Max ?");
        }






    }
}