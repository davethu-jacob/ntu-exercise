package com.jdbc.tutorial1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    // CRUD - Retrieve
    public Employee get(int empId) throws SQLException {
        Connection connection = Database.getConnection();
        Employee employee = null;
        String selectById = "Select * from Employee where EmployeeId = ?";
        PreparedStatement ps = connection.prepareStatement(selectById);
        ps.setInt(1, empId);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int oid = rs.getInt(1);
            int employeeId = rs.getInt(2);
            String firstName = rs.getString(3);
            String lastName = rs.getString(4);
            int departmentId = rs.getInt(5);
            employee = new Employee(oid, employeeId, firstName, lastName, departmentId);
        }
        Database.closeResultSet(rs);
        Database.closePreparedStatement(ps);
        Database.closeConnection(connection);
        return employee;
    }

    @Override
    // CRUD - Retrieve All
    public List<Employee> getAll() throws SQLException {
        String selectAll = "select Id, EmployeeId, FirstName, LastName, DepartmentId from Employee";
        List<Employee> employees = new ArrayList<>();

        Connection connection = Database.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(selectAll);

        while (rs.next()) {
            int id = rs.getInt("Id");
            int employeeId = rs.getInt("EmployeeId");
            String firstName = rs.getString("FirstName");
            String lastName = rs.getString("LastName");
            int departmentId = rs.getInt("DepartmentId");
            Employee employee = new Employee(id, employeeId, firstName, lastName, departmentId);
            employees.add(employee);
        }

        Database.closeResultSet(rs);
        Database.closeStatement(statement);
        Database.closeConnection(connection);
        return employees;
    }

    @Override
    public int save(Employee employee) {
        return 0;
    }

    @Override
    // CRUD - Create
    public int insert(Employee employee) throws SQLException {
        Connection connection = Database.getConnection();
        String insertQuery = "insert into Employee (EmployeeId, FirstName, LastName, DepartmentId) values (?, ?, ?, ?)";

        PreparedStatement ps = connection.prepareStatement(insertQuery);
        ps.setInt(1, employee.getEmployeeId());
        ps.setString(2, employee.getFirstName());
        ps.setString(3, employee.getLastName());
        ps.setInt(4, employee.getDepartmentId());
        int numberOfRows = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(connection);
        return numberOfRows;
    }

    @Override
    public int update(Employee employee) throws SQLException {
        Connection connection = Database.getConnection();
        String updateQuery = "update Employee set DepartmentId = ? where employeeId = ?";

        PreparedStatement ps = connection.prepareStatement(updateQuery);
        ps.setInt(1, employee.getDepartmentId());
        ps.setInt(2, employee.getEmployeeId());
        int numberOfRows = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(connection);

        return numberOfRows;
    }

    @Override
    public int delete(Employee employee) throws SQLException {
        Connection connection = Database.getConnection();
        String deleteQuery = "delete from Employee where Id = ?";

        PreparedStatement ps = connection.prepareStatement(deleteQuery);
        ps.setInt(1, employee.getId());
        int numberOfRows = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(connection);

        return numberOfRows;
    }
}
