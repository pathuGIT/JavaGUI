module org.example.communicationbetweenctrl {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.communicationbetweenctrl to javafx.fxml;
    exports org.example.communicationbetweenctrl;
}