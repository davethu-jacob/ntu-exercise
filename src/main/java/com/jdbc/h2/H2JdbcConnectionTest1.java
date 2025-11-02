package com.jdbc.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class H2JdbcConnectionTest1 {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:./todo;AUTO_SERVER=TRUE");

            String createTable = "create table if not exists TASK (id identity primary key, name varchar)";
            var statement = connection.createStatement();
            statement.execute(createTable);

            String insertQuery = "insert into task (name) values ('Learn Java!')";
            statement.execute(insertQuery);

            String insertStatement = "insert into task (name) values (?)";
            var preparedStatement = connection.prepareStatement(insertStatement);
            preparedStatement.setString(1, "Learn Spring!");
            preparedStatement.execute();

            String updateStatement = "update task set name = ? where name = 'Learn Java!'";
            preparedStatement = connection.prepareStatement(updateStatement);
            preparedStatement.setString(1, "Learn Jakarta EE!");
            preparedStatement.execute();

            String deleteQuery = "delete from task where name = 'Learn Jakarta EE!'";
            statement.execute(deleteQuery);

            String selectQuery = "select * from task";
            var resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
