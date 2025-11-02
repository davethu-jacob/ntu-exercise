package com.jdbc.h2;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class School {

    private static HikariDataSource getDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:h2:./school;AUTO_SERVER=TRUE");
        config.setMaximumPoolSize(10);
        config.setIdleTimeout(30000);
        config.setMaxLifetime(600000);
        HikariDataSource dataSource = new HikariDataSource(config);
        return dataSource;
    }

    private static void createTable(Connection connection) throws SQLException {
        String createTable = "create table if not exists student (id identity primary key, name varchar not null)";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTable);
        }
    }

    public static void insert(Connection connection) throws SQLException {
        String insertStatement = "insert into student (name) values (?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertStatement);
        preparedStatement.setString(1, "Esther");
        preparedStatement.execute();
    }

    public static void update(Student student) throws SQLException {
        try (Connection connection = getDataSource().getConnection()) {

        }
    }

    public static void deleteAll() throws SQLException {
        try (Connection connection = getDataSource().getConnection()) {

        }
    }

    public static List<Student> findAll() throws SQLException {
        List<Student> students = new ArrayList<>();
        try (Connection connection = getDataSource().getConnection()) {

        }
        return students;
    }

    public static void main(String[] args) throws SQLException {
        HikariDataSource dataSource = getDataSource();
        Connection connection = dataSource.getConnection();
        createTable(connection);
        insert(connection);
    }
}
