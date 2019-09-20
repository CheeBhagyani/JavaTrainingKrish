package chee.training.springdatajpaexample;

import chee.training.springdatajpaexample.modal.Address;
import chee.training.springdatajpaexample.modal.Student;
import chee.training.springdatajpaexample.modal.Telephone;
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

//    @RequestMapping(value = "/student", method = RequestMethod.GET)
//    public Student getStudent() {
//        Student firstStudent = new Student();
//        firstStudent.setName("Saman");
//
//        Address address = new Address();
//        address.setName("Kandy");
//        firstStudent.setAddress(address);
//
//        List<Telephone> telephones = new ArrayList<>();
//        Telephone telephone = new Telephone();
//        telephone.setNumber("0112456789");
//        telephones.add(telephone);
//        firstStudent.setTelephoneList(telephones);
//        return firstStudent;
//    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Student> getAll(Optional<Integer> id) {
        return studentService.findAll();
    }

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
    public Optional<Student> getById(@PathVariable Integer id) {
        return studentService.findById(id);
    }

    @PutMapping("/student/{id}")
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

//sss
}
