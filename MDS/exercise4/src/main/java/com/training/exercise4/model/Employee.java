package com.training.exercise4.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer empId;
	String name;
	String address;
	Date dob;
	String role;
	int salary;
	@CreationTimestamp
	Timestamp joindate;
	
	public Employee() {
	}

	public Employee(Integer empId, String name, String address, Date dob, String role, int salary, Timestamp joindate) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.role = role;
		this.salary = salary;
		this.joindate = joindate;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", dob=" + dob + ", role="
				+ role + ", salary=" + salary + ", joindate=" + joindate + "]";
	}

}
