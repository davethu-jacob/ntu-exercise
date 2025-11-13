package com.jdbc.tutorial1;

import java.sql.*;

public class Database {
    private static final String url = "jdbc:mysql://172.18.0.2/tutorial1";
    private static final String userName = "root";
    private static final String password = "P@ssword123";

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, userName, password);
        return connection;
    }

    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }

    public static void closeStatement(Statement statement) throws SQLException {
        statement.close();
    }

    public static void closePreparedStatement(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }

    public static void closeResultSet(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }
}
