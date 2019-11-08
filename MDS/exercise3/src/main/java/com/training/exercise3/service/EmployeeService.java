package com.training.exercise3.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.training.exercise3.model.Employee;
import com.training.exercise3.model.QEmployee;
import com.training.exercise3.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee update(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	public Optional<Employee> findById(Integer id) {
		return employeeRepository.findById(id);
	}

	public void delete(Integer id) {
		employeeRepository.deleteById(id);
	}

	// jpql
	public List<Employee> getAllEmp() {
		return employeeRepository.getAllEmp(Sort.by("name"));
	}

	// native query
	public List<Employee> getHrEmp(Integer id) {
		return employeeRepository.getHrEmp(id);
	}

	// query dsl
	public List<Employee> filterEmployees() {
		List<Employee> employees = new ArrayList<>();
		BooleanExpression booleanExpression = QEmployee.employee.address.eq("Colombo")
				.and(QEmployee.employee.role.eq("se"));
		Iterable<Employee> iterable = employeeRepository.findAll(booleanExpression);
		iterable.forEach(employees::add);
		return employees;
	}
}
