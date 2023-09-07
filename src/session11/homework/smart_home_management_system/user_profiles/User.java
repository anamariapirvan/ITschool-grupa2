package session11.homework.smart_home_management_system.user_profiles;

public class User {

    private String name;
    private String password; // homeowner, family member, guest;
    private UserRole role;

    public User(String name, String password, UserRole role) {
        this.name = name;
        this.password = password;

        this.role = role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
