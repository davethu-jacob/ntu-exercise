package com.jdbc.h2;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HikariDataSourceExample {
    public static void main(String[] args) {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:h2:./todo");
//        config.setUsername("your user name");
//        config.setPassword("your password");
//        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setMaximumPoolSize(10);
        config.setIdleTimeout(30000);
        config.setMaxLifetime(600000);

        // create Hikari data source
        try (HikariDataSource dataSource = new HikariDataSource(config)) {
            // obtain a connection from the pool
            try (Connection connection = dataSource.getConnection()) {
                // perform database operation
                String selectQuery = "select * from task";
                try (PreparedStatement statement = connection.prepareStatement(selectQuery)) {
                    ResultSet resultSet = statement.executeQuery();
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("name"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
