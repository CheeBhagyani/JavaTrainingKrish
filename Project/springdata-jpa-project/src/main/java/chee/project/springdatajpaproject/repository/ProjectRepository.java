package chee.project.springdatajpaproject.repository;

import chee.rentcloud.ems.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
