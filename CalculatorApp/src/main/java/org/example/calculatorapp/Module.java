package org.example.calculatorapp;

public class Module {
    public int calculate(int x, int y, String operator){
        switch (operator){
            case "+":
                return x + y;
            case "-":
                return x - y;
            case  "*":
                return x * y;
            case "/":
                return x / y;
            case "=":
                return x + y;
        }

        return  0;
    }
}
