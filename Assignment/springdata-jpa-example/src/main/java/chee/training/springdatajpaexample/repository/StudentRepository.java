package chee.training.springdatajpaexample.repository;

import chee.rentcloud.commons.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
