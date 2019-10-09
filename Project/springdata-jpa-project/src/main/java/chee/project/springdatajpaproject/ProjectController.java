package chee.project.springdatajpaproject;

import chee.project.springdatajpaproject.service.ProjectServiceImpl;
import chee.rentcloud.ems.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/ems")
public class ProjectController {
    @Autowired
    ProjectServiceImpl projectService;

    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    public List<Project> getAll(Optional<Integer> id) {
        return projectService.findAll();
    }

    @RequestMapping(value = "/project", method = RequestMethod.POST)
    public Project save(@RequestBody Project project) {
        return projectService.save(project);
    }

    @RequestMapping(value = "/project/{id}", method = RequestMethod.GET)
    public Optional<Project> getById(@PathVariable Integer id) {
        return projectService.findById(id);
    }
}
