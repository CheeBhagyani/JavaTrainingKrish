package chee.project.springdatajpaproject.service;

import chee.project.springdatajpaproject.repository.ProjectRepository;
import chee.rentcloud.ems.model.Employee;
import chee.rentcloud.ems.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl {
    @Autowired
    ProjectRepository projectRepository;

    public Project save(Project project) {
        return projectRepository.save(project);
    }

    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    public Optional<Project> findById(Integer id) {
        return projectRepository.findById(id);
    }
}
