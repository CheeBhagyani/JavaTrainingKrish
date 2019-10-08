package chee.project.springdatajpaproject;

import chee.project.springdatajpaproject.service.ProjectServiceImpl;
import chee.rentcloud.ems.model.Employee;
import chee.rentcloud.ems.model.Project;
import chee.rentcloud.ems.model.Telephone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/ems")
public class ProjectController {
    @Autowired
    ProjectServiceImpl projectService;

    @RequestMapping(value = "/project", method = RequestMethod.POST)
    public Project save(@RequestBody Project project) {
        return projectService.save(project);
    }
}
