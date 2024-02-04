package org.example.calculatorapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    private String operator;
    private String value1 = "0";
    private String value2 = "0";
    private int ans = 0;
    private Boolean clickOpert = false;
    private Module module = new Module();

    @FXML
    Label result;
    @FXML
    Label Operstor;
    @FXML
    public void getNumber(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        if(clickOpert == false){
            value1 += value;
            result.setText(value1);
        } else if (clickOpert == true) {
            value2 += value;
            result.setText(value2);
        }

    }
    @FXML
    public void getOperator(ActionEvent event){
        int num1 = 0;
        int num2 = 0;

        if(clickOpert == false){
            clickOpert = true;
            operator = ((Button)event.getSource()).getText();
            Operstor.setText(operator);
        }else{
            if(operator == "="){
                result.setText(Integer.toString(ans));
            }else{
                num1 = Integer.parseInt(value1);
                num2 = Integer.parseInt(value2);


                ans = module.calculate(num1,num2,operator);
                result.setText(Integer.toString(ans));
                value1 = Integer.toString(ans);
                value2 = "0";
                operator = ((Button)event.getSource()).getText();
                Operstor.setText(operator);

            }

        }
    }
    @FXML
    public void Exit(){
        operator = "";
        value1 = "0";
        value2 = "0";
        clickOpert = false;
        ans = 0;
        result.setText("");
    }
}