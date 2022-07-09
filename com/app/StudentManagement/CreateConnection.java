package com.app.StudentManagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class CreateConnection {
    public static Connection createConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // returns the connection object
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
    }
}
