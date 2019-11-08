package com.training.exercise.constructorinjection;

public class Employee {
	private Department department;

	public Employee(Department department) {
		this.department = department;
	}

	public void printDeptName(String deptName) {
		department.print(deptName);
	}
}
