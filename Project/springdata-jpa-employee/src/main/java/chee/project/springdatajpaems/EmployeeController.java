package chee.project.springdatajpaems;

import chee.project.springdatajpaems.service.EmployeeServiceImpl;
import chee.rentcloud.ems.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/ems")
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getAll(Optional<Integer> id) {
        return employeeService.findAll();
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Optional<Employee> getById(@PathVariable Integer id) {
        return employeeService.findById(id);
    }

    @PutMapping("/employee/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Integer id) {
        return employeeService.findById(id)
                .map(employee -> {
                    employee.setEname(newEmployee.getEname());
                    employee.setEmail(newEmployee.getEmail());
                    employee.setContact(newEmployee.getContact());

                    return employeeService.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setEid(id);
                    return employeeService.save(newEmployee);
                });
    }
}
