package com.training.exercise3.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.*;

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

	@ManyToOne
	Department department;
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
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

	public String getAdress() {
		return address;
	}

	public void setAdress(String adress) {
		this.address = adress;
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

	public Employee() {
		super();
	}

	public Employee(Integer empId, String name, String adress, Date dob, String role, int salary, Timestamp joindate) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = adress;
		this.dob = dob;
		this.role = role;
		this.salary = salary;
		this.joindate = joindate;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", adress=" + address + ", dob=" + dob + ", role=" + role
				+ ", salary=" + salary + ", joindate=" + joindate + "]";
	}

}
