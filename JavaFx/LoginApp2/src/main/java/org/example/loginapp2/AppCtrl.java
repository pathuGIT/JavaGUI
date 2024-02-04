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
import java.sql.ResultSet;

public class AppCtrl {
    private Stage stage;
    private Scene scene;

    @FXML
    private TextField userName;
    @FXML
    private TextField userPwd;
    @FXML
    private Label errorId;
    @FXML
    private Button cancelButton;

    public void switchToLogin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void loginToHome(ActionEvent event) throws IOException {
        String query = "select * from student";

        try {
            dbConnect connect = new dbConnect();
            ResultSet result = connect.statement.executeQuery(query);

            String tg;
            String pwd;

            while (result.next()){
                tg = result.getString(1);
                pwd = result.getString(6);

                if(userName.getText().equals(tg) && userPwd.getText().equals(pwd)){

                    Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
                    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();

                }else if(userName.getText().equals("admin") && userPwd.getText().equals("1234")){
                    new dbSelect("ADMIN","1234",event);
                    break;

                }else if(userName.getText().equals("dean") && userPwd.getText().equals("1234")){
                    new dbSelect("DEAN","1234", event);
                    break;

                }else{
                    errorId.setText("Wrong wrong....");
                }
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void setCancelButton(ActionEvent e) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

}
