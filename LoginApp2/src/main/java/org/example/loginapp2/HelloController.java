package org.example.loginapp2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.*;

public class HelloController {
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
//          errorId.setText("You are trying to login");
            validLogin();
        }else{
            errorId.setText("Something wrong");
        }
    }

    public void setCancelButton(ActionEvent e) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

//    public void validLogin(){
//        dbConnect connect = new dbConnect();
//        Connection connDb = connect.getConnection();
//
//        String validLogin = "select count(1) from users where username = '"+userName+"' and password = '"+userPwd+"'";
//
//        try{
//            Statement statement = connDb.createStatement();
//            ResultSet qeryResult = statement.executeQuery(validLogin);
////            while (qeryResult.next()){
////                if(qeryResult.getInt(1)==1){
////                    System.out.println("Welcome");
////                    errorId.setText("Welcome");
////                }else{
////                    errorId.setText("Invalid Login");
////                    System.out.println("Wrong");
////                }
////            }
//            System.out.println(qeryResult.getRow());
//        }catch(Exception e){
//
//        }

//    }

    public void validLogin() {
        dbConnect connect = new dbConnect();
        Connection connDb = connect.getConnection();

        String selectQuery = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (PreparedStatement preparedStatement = connDb.prepareStatement(selectQuery)) {
            preparedStatement.setString(1, userName.getText());
            preparedStatement.setString(2, userPwd.getText());

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Valid login
                System.out.println("Welcome");
                errorId.setText("Welcome");
            } else {
                // Invalid login
                errorId.setText("Invalid Login");
                System.out.println("Wrong");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}