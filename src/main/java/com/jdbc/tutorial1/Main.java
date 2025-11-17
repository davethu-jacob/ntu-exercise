package com.jdbc.tutorial1;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        // Test for database connectivity
        /**
        System.out.println(employee);
        Connection connection = Database.getConnection();
        if (connection != null) {
            System.out.println("Database connection successful");
         */

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee employee = null;

        // Test for record insertion
        /**
        employee = new Employee(0, 3, "Michelle", "Ashwini", 3);
        employeeDAO.insert(employee);
         */

        // Update specific record

        employee = employeeDAO.get(3);
        System.out.println(employee);
        employee.setDepartmentId(4);
        int numberOfRows = employeeDAO.update(employee);

        // Test for specific record deletion
        /**
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee employee = employeeDAO.get(2);
        System.out.println(employee);
        int numberOfRows = employeeDAO.delete(employee);
         */

        // Test for listing all employees
        List<Employee> employees = employeeDAO.getAll();
        System.out.println(employees);
    }
}
