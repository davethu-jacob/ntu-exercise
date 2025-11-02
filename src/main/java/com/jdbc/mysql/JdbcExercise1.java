package com.jdbc.mysql;

import java.sql.*;

public class JdbcExercise1 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String userName = "root";
        String password = "P@ssword123";
        String selectQuery = "select * from employee";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(selectQuery);

        while (rs.next()) {
            System.out.printf("id: %d name: %s salary: %d", rs.getInt(1), rs.getString(2), rs.getInt(3));
        }

        connection.close();
    }
}
