package com.example.pa;

import java.sql.*;

public class DBCredentials {
    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";  

    public Connection getConnection(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "testdb", USER, PASS);
        return con;
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
    return null;
    }
}
