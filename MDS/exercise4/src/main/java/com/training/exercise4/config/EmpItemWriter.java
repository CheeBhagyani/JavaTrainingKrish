package com.training.exercise4.config;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.training.exercise4.model.Employee;

@Component
public class EmpItemWriter implements ItemWriter<Employee>{

	@Override
	public void write(List<? extends Employee> items) throws Exception {
		System.out.println(items);
	}
	
}
