package session11.homework.smart_home_management_system.user_profiles;

import java.util.ArrayList;
import java.util.List;

public class Authentication {

    private List<User> users = new ArrayList<>();

    public Authentication() {
        users.add(new User("HomeOwner", "pass123", UserRole.HOMEOWNER));
        users.add((new User("FamilyMember", " pass1223", UserRole.FAMILY_MEMBER)));
        users.add(new User("Guest", "guest123", UserRole.GUEST));
    }

    public User authenticateUser(String name, String password) {
        for (User user : users) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null; //authentication failed;
    }
}
