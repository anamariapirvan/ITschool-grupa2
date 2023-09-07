package session12.practice.user_service;

public class UserServiceImpl implements UserService {
    @Override
    public void createUser() {
    }

    public static void main(String[] args) {
        UserServiceImpl userServiceImpl=new UserServiceImpl();
        UserService userService=userServiceImpl;
    }
}
