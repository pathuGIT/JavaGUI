module com.example.scene {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scene to javafx.fxml;
    exports com.example.scene;
}