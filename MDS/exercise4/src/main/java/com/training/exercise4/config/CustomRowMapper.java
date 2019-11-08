package com.training.exercise4.config;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.training.exercise4.model.Employee;

public class CustomRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmpId(rs.getInt("empId"));
		employee.setName(rs.getString("name"));
		employee.setAddress(rs.getString("address"));
		employee.setDob(rs.getDate("dob"));
		employee.setRole(rs.getString("role"));
		employee.setSalary(rs.getInt("salary"));
		employee.setSalary(rs.getInt("salary"));
		return employee;
	}

}
	