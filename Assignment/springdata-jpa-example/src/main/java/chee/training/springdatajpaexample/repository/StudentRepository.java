package chee.training.springdatajpaexample.repository;

import chee.training.springdatajpaexample.modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
