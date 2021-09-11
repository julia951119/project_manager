package controller;

import User.TaskZadanie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import repository.TaskRepository;

@Controller
public class ControllerTask {

    TaskZadanie task;
    String taskName;
    TaskRepository taskRepository;

    public ControllerTask(TaskRepository taskRepository){
        this.taskRepository = taskRepository;

    }


    @PostMapping(value = {"/DodajZadanie"})
    public String setTask(Model model) {

       TaskZadanie taskZadanie = taskRepository.save(new TaskZadanie(taskName));
            model.getAttribute(taskZadanie.getTaskName());


        System.out.println(taskZadanie.getTaskName());
        return "taskName";
    }
}
