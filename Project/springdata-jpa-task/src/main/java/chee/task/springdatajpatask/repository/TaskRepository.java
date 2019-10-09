package chee.task.springdatajpatask.repository;

import chee.rentcloud.ems.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
