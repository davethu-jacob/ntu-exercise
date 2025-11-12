package com.jdbc.tutorial1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String url = "jdbc:mysql://172.18.0.2/tutorial1";
    private static final String userName = "root";
    private static final String password = "P@ssword123";

    private Database() {

    }

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, userName, password);
        return connection;
    }
}
