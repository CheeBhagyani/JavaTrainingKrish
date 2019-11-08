package com.training.exercise;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	private Statement stm;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionFactory.getConnection();

		String create = "CREATE TABLE EMPLOYEE " + "(empId INT PRIMARY KEY     NOT NULL,"
				+ " name           TEXT    NOT NULL, " + " address        TEXT    NOT NULL, " 
				+ " dob            DATE, "
				+ " role        	TEXT    NOT NULL, "
				+ " salary         REAL ,"
				+ " joindate   TIMESTAMPTZ NOT NULL DEFAULT NOW())";

		String insert = "INSERT INTO employee (empId,name,address,dob,role,salary) " + "VALUES "
				+ "(1, 'Anna', 'Colombo', '1995-12-05','qa', 1000 ),"
				+ "(2, 'John', 'Kandy', '1995-04-04','ba', 2000 ),"
				+ "(3, 'Bhagyani', 'colombo', '1995-02-05','se', 1000 ),"
				+ "(4, 'Kasun', 'Colombo', '1995-03-18','ba', 1000 ),"
				+ "(5, 'Jane', 'Matale', '1995-07-10','se', 1000 ),"
				+ "(6, 'Eddie', 'Colombo', '1995-08-15','se', 1000 ),"
				+ "(7, 'Sam', 'Kagalle', '1995-11-05','qa', 1000 )," 
				+ "(8, 'Roy', 'Kandy', '1995-05-31','se', 1000 ),"
				+ "(9, 'Peter', 'Galle', '1995-06-25','qa', 1000 ),"
				+ "(10, 'Jane', 'Matale', '1995-09-15','se', 1000 );";

		String query = "SELECT * FROM employee";

		Main main = new Main();

//		main.executeQuery(connection, create);
//		main.executeQuery(connection, insert);

		ResultSet resultSet = main.getAll(connection, query);
		List<Employee> employeeList = main.getEmployees(resultSet);
		
		employeeList.stream().filter(e -> e.getSalary() > 500).collect(Collectors.toMap(Employee::getEmpId, e -> e))
				.forEach((k, v) -> { 
					System.out.println("key: " + k + " , Value: " + v);
					System.out.println("Time: " + new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss Z").format(Timestamp.valueOf(v.getJoindate().toLocalDateTime().minusDays(5).minusMonths(2))));
				});

	}

	private static SimpleDateFormat SimpleDateFormat(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public int executeQuery(Connection conn, String query) {
		int result = 0;
		try {
			stm = conn.createStatement();
			result = stm.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stm != null) {
					stm.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public List<Employee> getEmployees(ResultSet rs) {
		List<Employee> employeeList = new ArrayList<>();

		try {
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt("empId"));
				emp.setName(rs.getString("name"));
				emp.setAdress(rs.getString("address"));
				emp.setDob(rs.getDate("dob"));
				emp.setRole(rs.getString("role"));
				emp.setSalary(rs.getInt("salary"));
				emp.setJoindate(rs.getTimestamp("joindate"));
				employeeList.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stm != null) {
					stm.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return employeeList;
	}

	public ResultSet getAll(Connection conn, String query) {
		ResultSet res = null;
		try {
			stm = conn.createStatement();
			res = stm.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
}
