package chee.training.springdatajpaexample;

import chee.rentcloud.commons.model.Student;
import chee.rentcloud.commons.model.Telephone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import chee.training.springdatajpaexample.service.StudentServiceImpl;

import java.util.*;

@RestController
@RequestMapping(value = "/sms")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;

    @RequestMapping(value = "/hello")
    public String greeting(){
        return "hello springboot";
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student) {
        for (Telephone telephone: student.getTelephoneList()) {
            telephone.setStudent(student);
        }
        return studentService.save(student);
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> getAll(Optional<Integer> id) {
        return studentService.findAll();
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public Optional<Student> getById(@PathVariable Integer id) {
        return studentService.findById(id);
    }

    @PutMapping("/students/{id}")
    Student replaceEmployee(@RequestBody Student newStudent, @PathVariable Integer id) {
        return studentService.findById(id)
                .map(student -> {
                    student.setName(newStudent.getName());
                    student.setAddress(newStudent.getAddress());
                    student.setTelephoneList(newStudent.getTelephoneList());
                    return studentService.save(student);
                })
                .orElseGet(() -> {
                    newStudent.setSid(id);
                    return studentService.save(newStudent);
                });
    }
}
