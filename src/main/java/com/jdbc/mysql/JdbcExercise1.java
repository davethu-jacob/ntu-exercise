package com.jdbc.mysql;

import java.lang.reflect.Type;
import java.sql.*;

public class JdbcExercise1 {
    public static void main(String[] args) throws SQLException {
//        readRecords();
//        insertRecords();
//        insertVar();
//        insertUsingPreparedStatement();
//        delete();
//        update();
//        readRecords();
//        storedProcedure();
//        storedProcedureToGetEmployeeById();
//        storedProcedureToGetEmployeeNameById();
//        commitDemo();
        batchUpdate();
        readRecords();
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
        String insertQuery = "insert into employee values (?, ?, ?)";

        Connection connection = DriverManager.getConnection(url, userName, password);
        PreparedStatement pst = connection.prepareStatement(insertQuery);
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setInt(3, salary);
        int rowsAffected = pst.executeUpdate();

        System.out.println();
        System.out.println("Number of rows affected: " + rowsAffected);

        connection.close();

    }

    public static void delete() throws SQLException {
        String url = "jdbc:mysql://172.18.0.2:3306/jdbcdemo";
        String userName = "root";
        String password = "P@ssword123";

        int id = 5;
        String deleteQuery = "delete from employee where emp_id = ?";

        Connection connection = DriverManager.getConnection(url, userName, password);
        PreparedStatement ps = connection.prepareStatement(deleteQuery);
        ps.setInt(1, id);
        int rowsAffected = ps.executeUpdate();

        System.out.println();
        System.out.println("Number of rows affected: " + rowsAffected);

        connection.close();

    }

    public static void update() throws SQLException {
        String url = "jdbc:mysql://172.18.0.2:3306/jdbcdemo";
        String userName = "root";
        String password = "P@ssword123";

        int id = 1;
        String updateQuery = "update employee set salary = 15000 where emp_id = ?";

        Connection connection = DriverManager.getConnection(url, userName, password);
        PreparedStatement ps = connection.prepareStatement(updateQuery);
        ps.setInt(1, id);
        int rowsAffected = ps.executeUpdate();

        System.out.println();
        System.out.println("Number of rows affected: " + rowsAffected);

        connection.close();
    }

    public static void storedProcedure() throws SQLException {
        String url = "jdbc:mysql://172.18.0.2:3306/jdbcdemo";
        String userName = "root";
        String password = "P@ssword123";

        Connection connection = DriverManager.getConnection(url, userName, password);
        CallableStatement cs = connection.prepareCall("{call getEmployee()}");
        ResultSet rs = cs.executeQuery();

        while (rs.next()) {
            System.out.printf("id: %d name: %s salary: %d\n", rs.getInt(1), rs.getString(2), rs.getInt(3));
        }

        connection.close();

    }

    public static void storedProcedureToGetEmployeeById() throws SQLException {
        String url = "jdbc:mysql://172.18.0.2:3306/jdbcdemo";
        String userName = "root";
        String password = "P@ssword123";

        int id = 3;

        Connection connection = DriverManager.getConnection(url, userName, password);
        CallableStatement cs = connection.prepareCall("{call getEmployeeById(?)}");
        cs.setInt(1, id);
        ResultSet rs = cs.executeQuery();

        while (rs.next()) {
            System.out.printf("id: %d name: %s salary: %d\n", rs.getInt(1), rs.getString(2), rs.getInt(3));
        }
        connection.close();
    }

    public static void storedProcedureToGetEmployeeNameById() throws SQLException {
        String url = "jdbc:mysql://172.18.0.2:3306/jdbcdemo";
        String userName = "root";
        String password = "P@ssword123";

        int id = 3;

        Connection connection = DriverManager.getConnection(url, userName, password);
        CallableStatement cs = connection.prepareCall("{call getEmployeeNameById(?, ?)}");
        cs.setInt(1, id);
        cs.registerOutParameter(2, Types.VARCHAR);
        cs.executeUpdate();
        System.out.println("The name is: " + cs.getString(2));

        connection.close();
    }

    public static void commitDemo() throws SQLException {
        String url = "jdbc:mysql://172.18.0.2:3306/jdbcdemo";
        String userName = "root";
        String password = "P@ssword123";

        String query1 = "update employee set salary = 14000 where emp_id = 2";
        String query2 = "update employee set salary = 12000 where emp_id = 4";

        Connection connection = DriverManager.getConnection(url, userName, password);
        connection.setAutoCommit(false);
        Statement statement = connection.createStatement();
        int rows1 = statement.executeUpdate(query1);
        System.out.println("Rows affected: " + rows1);
        int rows2 = statement.executeUpdate(query2);
        if (rows1 > 0 && rows2 > 0)
            connection.commit();

        connection.close();
    }

    public static void batchUpdate() throws SQLException {
        String url = "jdbc:mysql://172.18.0.2:3306/jdbcdemo";
        String userName = "root";
        String password = "P@ssword123";

        String query1 = "update employee set salary = 12000 where emp_id = 1";
        String query2 = "update employee set salary = 12000 where emp_id = 2";

        Connection connection = DriverManager.getConnection(url, userName, password);
        connection.setAutoCommit(false);
        Statement statement = connection.createStatement();
        statement.addBatch(query1);
        statement.addBatch(query2);
        int[] result = statement.executeBatch();
        for (int i : result) {
            if (i > 0)
                continue;
            else connection.rollback();
        }
        connection.commit();
        connection.close();
    }

}
