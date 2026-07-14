package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "Rintu@1234";


        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement stmt=connection.createStatement();
           int rows = stmt.executeUpdate("insert into student_data values (54,'ajit','Mernstack')");
            System.out.println(rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    }