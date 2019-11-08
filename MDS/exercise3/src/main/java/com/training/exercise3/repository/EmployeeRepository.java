package com.training.exercise3.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.jpa.repository.Query;

import com.training.exercise3.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>, QuerydslPredicateExecutor<Employee>{

	@Query("SELECT e FROM Employee e, Department d WHERE e.department.dId=d.dId")
	List<Employee> getAllEmp(Sort sort);
	
	@Query(value="SELECT * FROM employee WHERE department_dId=?1", nativeQuery = true)
	List<Employee> getHrEmp(Integer id);	
}
