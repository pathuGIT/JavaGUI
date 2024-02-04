module org.example.calculatorapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.calculatorapp to javafx.fxml;
    exports org.example.calculatorapp;
}