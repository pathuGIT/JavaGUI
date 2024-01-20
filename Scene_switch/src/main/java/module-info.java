module org.example.scene_switch {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.scene_switch to javafx.fxml;
    exports org.example.scene_switch;
}