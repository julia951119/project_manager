package repository;


import User.User;
import org.springframework.data.repository.CrudRepository;
import User.TaskZadanie;


import java.util.List;

public interface TaskRepository extends CrudRepository<TaskZadanie, Long> {
    List<TaskZadanie> listoftasks();


}
