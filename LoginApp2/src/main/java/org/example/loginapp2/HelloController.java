package org.example.loginapp2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class HelloController {
    private Stage stage;
    @FXML
    private Button cancelButton;
    @FXML
    private Label errorId;
    @FXML
    private TextField userName;

    @FXML
    private TextField userPwd;

    public void loginButtton(ActionEvent e){
        if(userName.getText().isBlank() == false && userPwd.getText().isBlank() == false){
            validLogin();
        }else{
            errorId.setText("Something wrong");
        }
    }

    public void setCancelButton(ActionEvent e) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
    public void switchToSce1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void validLogin() {
        dbConnect connect = new dbConnect();
        Connection connDb = connect.studentConnection();

        String selectQuery = "SELECT * FROM student WHERE Std_id = ? AND Password = ?";

        try (PreparedStatement preparedStatement = connDb.prepareStatement(selectQuery)) {
            preparedStatement.setString(1, userName.getText());
            preparedStatement.setString(2, userPwd.getText());

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                errorId.setText("Welcome");
                switchToSce1();
            } else if (userName.getText().equals("DEAN") && userPwd.getText().equals("DE123")){
                errorId.setText("Welcome Dean");
            } else if (userName.getText().equals("ADMIN")  && userPwd.getText().equals("Admin123")) {
                errorId.setText("Welcome ADMIN");
            } else if (userName.getText().equals("LECTURE") && userPwd.getText().equals("Lec123")) {
                errorId.setText("Welcome Lecture");
            }else{
                errorId.setText("You are trying to login.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}