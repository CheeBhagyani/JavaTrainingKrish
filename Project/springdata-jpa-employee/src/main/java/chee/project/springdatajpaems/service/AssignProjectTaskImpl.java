package chee.project.springdatajpaems.service;

import chee.project.springdatajpaems.repository.AssignProjectTaskRepository;
import chee.rentcloud.ems.model.AssignProjectTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignProjectTaskImpl {
    @Autowired
    AssignProjectTaskRepository assignProjectTaskRepository;

    public List<AssignProjectTask> saveProjectTask(List<AssignProjectTask> assignProjectTasks){
        return assignProjectTaskRepository.saveAll(assignProjectTasks);
    }
}
