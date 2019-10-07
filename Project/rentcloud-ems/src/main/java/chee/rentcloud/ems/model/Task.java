package chee.rentcloud.ems.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task {
    @Id
    private Integer taskId;
    private String taskName;
    private String taskDes;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDes() {
        return taskDes;
    }

    public void setTaskDes(String taskDes) {
        this.taskDes = taskDes;
    }
}
