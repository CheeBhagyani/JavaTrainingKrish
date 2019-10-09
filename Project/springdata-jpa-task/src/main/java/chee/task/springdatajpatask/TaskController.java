package chee.task.springdatajpatask;

import chee.rentcloud.ems.model.Task;
import chee.task.springdatajpatask.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/ems")
public class TaskController {
    @Autowired
    TaskServiceImpl taskService;

    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public List<Task> getAll(Optional<Integer> id) {
        return taskService.findAll();
    }

    @RequestMapping(value = "/task", method = RequestMethod.POST)
    public Task save(@RequestBody Task task) {
        return taskService.save(task);
    }
}
