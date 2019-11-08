package com.training.exercise5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.exercise5.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
