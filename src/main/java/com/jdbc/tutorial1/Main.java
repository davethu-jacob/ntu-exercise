package com.jdbc.tutorial1;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        // Test for database connectivity
        /**
        System.out.println(employee);
        Connection connection = Database.getConnection();
        if (connection != null) {
            System.out.println("Database connection successful");
         */

        // Test for record insertion
        /**
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee employee = new Employee(1, "Davethu", "D Jacob", 1);
        employeeDAO.insert(employee);
         */

        // Test for record deletion
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee employee = employeeDAO.get(2);
        System.out.println(employee);
        int numberOfRows = employeeDAO.delete(employee);
    }
}
