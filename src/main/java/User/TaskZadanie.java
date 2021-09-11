package User;

import repository.TaskRepository;
import repository.UserRepository;

import javax.persistence.Entity;


@Entity
public class TaskZadanie {
    TaskRepository taskRepository;
    String taskName;
    public TaskZadanie(String taskName){
        this.taskName = taskName;
    }


    public void setTaskRepository(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
