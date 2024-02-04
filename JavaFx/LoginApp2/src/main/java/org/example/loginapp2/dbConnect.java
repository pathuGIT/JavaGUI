package org.example.loginapp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnect {
    public Connection datalink;
    public Connection studentConnection(){
        String dbName = "tecmis_teclms";
        String dbUser = "STUDENT";
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

    public Connection deanConnection(){
        String dbName = "tecmis_teclms";
        String dbUser = "DEAN";
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
