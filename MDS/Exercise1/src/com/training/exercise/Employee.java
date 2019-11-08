package com.training.exercise;

import java.sql.Timestamp;
import java.util.Date;

public class Employee {

	int empId;
	String name;
	String adress;
	Date dob;
	String role;
	int salary;
	Timestamp joindate;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Timestamp getJoindate() {
		return joindate;
	}
	public void setJoindate(Timestamp joindate) {
		this.joindate = joindate;
	}
	public Employee(int empId, String name, String adress, Date dob, String role, int salary, Timestamp joindate) {
		super();
		this.empId = empId;
		this.name = name;
		this.adress = adress;
		this.dob = dob;
		this.role = role;
		this.salary = salary;
		this.joindate = joindate;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", adress=" + adress + ", dob=" + dob + ", role=" + role
				+ ", salary=" + salary + ", joindate=" + joindate + "]";
	}
	public Employee() {
	}
	
	
	
	
}
