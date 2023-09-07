package session11.practice.userservice;

public interface UserService {
    void createUser ( User user);
    User findUserById(long id);

    void deleteUser (long id);
}

