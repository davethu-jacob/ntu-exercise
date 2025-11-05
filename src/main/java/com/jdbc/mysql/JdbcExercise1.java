package com.jdbc.mysql;

import java.sql.*;

public class JdbcExercise1 {
    public static void main(String[] args) throws SQLException {
        readRecords();
//        insertRecords();
//        insertVar();
        insertUsingPreparedStatement();
    }

    public static void readRecords() throws SQLException {
        String url = "jdbc:mysql://172.18.0.2:3306/jdbcdemo";
        String userName = "root";
        String password = "P@ssword123";
        String selectQuery = "select * from employee";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(selectQuery);

        while (rs.next()) {
            System.out.printf("id: %d name: %s salary: %d\n", rs.getInt(1), rs.getString(2), rs.getInt(3));
        }

        connection.close();

    }

    public static void insertRecords() throws SQLException {
        String url = "jdbc:mysql://172.18.0.2:3306/jdbcdemo";
        String userName = "root";
        String password = "P@ssword123";
        String insertQuery = "insert into employee values (4, 'Melissa', 8000)";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        int rowsAffected = statement.executeUpdate(insertQuery);

        System.out.println();
        System.out.println("Number of rows affected: " + rowsAffected);

        connection.close();

    }

    public static void insertVar() throws SQLException {
        String url = "jdbc:mysql://172.18.0.2:3306/jdbcdemo";
        String userName = "root";
        String password = "P@ssword123";

        int id = 5;
        String name = "Paul Anand";
        int salary = 9000;
//        String insertQuery = "insert into employee values (4, 'Melissa', 8000)";
        String insertQuery = "insert into employee values (" + id + ", '" + name + "', " + salary + ");";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        int rowsAffected = statement.executeUpdate(insertQuery);

        System.out.println();
        System.out.println("Number of rows affected: " + rowsAffected);

        connection.close();

    }

    public static void insertUsingPreparedStatement() throws SQLException {
        String url = "jdbc:mysql://172.18.0.2:3306/jdbcdemo";
        String userName = "root";
        String password = "P@ssword123";

        int id = 6;
        String name = "Joel Jabez";
        int salary = 5000;
//        String insertQuery = "insert into employee values (4, 'Melissa', 8000)";
        String insertQuery = "insert into employee values (?, ?, ?)";

        Connection connection = DriverManager.getConnection(url, userName, password);
        PreparedStatement pst = connection.prepareStatement(insertQuery);
//        Statement statement = connection.createStatement();
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setInt(3, salary);
        int rowsAffected = pst.executeUpdate();
//        int rowsAffected = statement.executeUpdate(insertQuery);

        System.out.println();
        System.out.println("Number of rows affected: " + rowsAffected);

        connection.close();

    }

}
