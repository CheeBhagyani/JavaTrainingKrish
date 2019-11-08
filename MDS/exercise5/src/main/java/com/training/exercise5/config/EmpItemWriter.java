package com.training.exercise5.config;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.training.exercise5.model.Employee;
import com.training.exercise5.repository.EmployeeRepository;

public class EmpItemWriter implements ItemWriter<Employee>{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public void write(List<? extends Employee> items) throws Exception {
		employeeRepository.saveAll(items);
		
	}

}
