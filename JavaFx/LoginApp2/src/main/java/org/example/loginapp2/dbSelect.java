package org.example.loginapp2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dbSelect {
    private Stage stage;
    private Scene scene;
    String user;
    String pswd;
    
    Statement statement;

    public dbSelect(String user, String pswd, ActionEvent event){
        String url = "jdbc:mysql://localhost:3306/tecmis_teclms";
        this.user = user;
        this.pswd = pswd;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,pswd);
            statement = conn.createStatement();

            Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }catch (Exception e){
            System.out.println(e);
        }
    }


}
