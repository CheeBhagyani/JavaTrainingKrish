package com.training.exercise3.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer dId;
	String name;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	@JsonIgnore
	List<Employee> employees;

	public Integer getdId() {
		return dId;
	}

	public void setdId(Integer dId) {
		this.dId = dId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Department() {
		super();
	}

	public Department(Integer dId, String name) {
		super();
		this.dId = dId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", name=" + name + "]";
	}
	
}
