module org.example.loginapp2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens org.example.loginapp2 to javafx.fxml;
    exports org.example.loginapp2;
}