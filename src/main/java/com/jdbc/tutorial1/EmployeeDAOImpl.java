package com.jdbc.tutorial1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public Employee get(int id) throws SQLException {
        Connection connection = Database.getConnection();
        Employee employee = null;
        String selectById = "Select * from Employee where id = ?";
        PreparedStatement ps = connection.prepareStatement(selectById);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int oid = rs.getInt(1);
            int employeeId = rs.getInt(2);
            String firstName = rs.getString(3);
            String lastName = rs.getString(4);
            int departmentId = rs.getInt(5);
            employee = new Employee(oid, employeeId, firstName, lastName, departmentId);
        }
        connection.close();
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        return List.of();
    }

    @Override
    public int save(Employee employee) {
        return 0;
    }

    @Override
    public int insert(Employee employee) throws SQLException {
        Connection connection = Database.getConnection();
        String insertQuery = "insert into Employee (employeeId, firstName, lastName, departmentId) values (?, ?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(insertQuery);
        ps.setInt(1, employee.getEmployeeId());
        ps.setString(2, employee.getFirstName());
        ps.setString(3, employee.getLastName());
        ps.setInt(4, employee.getDepartmentId());
        int numberOfRows = ps.executeUpdate();

        connection.close();
        return numberOfRows;
    }

    @Override
    public int update(Employee employee) {
        return 0;
    }

    @Override
    public int delete(Employee employee) throws SQLException {
        Connection connection = Database.getConnection();
        String deleteQuery = "delete from Employee where id = ?";
        PreparedStatement ps = connection.prepareStatement(deleteQuery);
        ps.setInt(1, employee.getId());
        int numberOfRows = ps.executeUpdate();
        connection.close();

        return numberOfRows;
    }
}
