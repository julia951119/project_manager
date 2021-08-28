package User;

import repository.UserRepository;
import repository.UserRepositoryInterface;

import java.util.Objects;

public class User implements UserRepositoryInterface {


    public User(){
        this.userRepository = userRepository.find();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userRepository, user.userRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode();
    }
}
