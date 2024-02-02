package org.example.loginapp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnect {
    public Connection datalink;
    public Connection getConnection(){
        String dbName = "class";
        String dbUser = "root";
        String dbPwd = "1234";
        String url = "jdbc:mysql://localhost:3306/" + dbName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            datalink = DriverManager.getConnection(url, dbUser, dbPwd);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return datalink;
    }
}
