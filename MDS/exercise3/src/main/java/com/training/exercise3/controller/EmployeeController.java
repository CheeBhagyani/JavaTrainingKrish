package com.training.exercise3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.exercise3.model.Employee;
import com.training.exercise3.service.EmployeeService;

@RestController
@RequestMapping(value = "/exercise3")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	//create
	@RequestMapping(value = "/employees", method = RequestMethod.POST)
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }
	
	//update
	@RequestMapping(value = "/employees", method = RequestMethod.PUT)
    public Employee update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

	//get all
    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getAll(Optional<Integer> id) {
        return employeeService.findAll();
    }
    
    //get by id
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public Optional<Employee> getEmployee(@PathVariable Integer id){
        return employeeService.findById(id);
    }
    
    //delete
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable Integer id){
        employeeService.delete(id);
    }
    
    //jpql query
    @RequestMapping(value = "/employees/all",method = RequestMethod.GET)
    public List<Employee> getAllEmp(){
        return employeeService.getAllEmp();
    }
    
    //native query
    @RequestMapping(value = "/employees/hr/{id}",method = RequestMethod.GET)
    public List<Employee> getHrEmp(@PathVariable Integer id){
        return employeeService.getHrEmp(id);
    }
    
    //filter query dsl
    @RequestMapping(value = "/employees/colombo", method = RequestMethod.GET)
    public List<Employee> getFilteredEmployees() {
        return employeeService.filterEmployees();
    }
    
}
