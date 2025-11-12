package com.jdbc.mysql.busTicketReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String url = "jdbc:mysql://172.18.0.2/BusReservation";
    private static final String userName = "root";
    private static final String password = "P@ssword123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, userName, password);
    }

}
