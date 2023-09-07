package session12.homework.building_construction_application;


public class Main {
    public static void main(String[] args) {
        // Create an instance of the building construction application
        BuildingConstructionApplication app = new BuildingConstructionApplication();

        // Add admins
        Admin admin1 = new Admin();
        Admin admin2 = new Admin();
        app.addAdmin(admin1);
        app.addAdmin(admin2);
        System.out.println("Admins added.");

        // Add users
        User user1 = new Employee("User1", "user1@example.com", "Engineer");
        User user2 = new Employee("User2", "user2@example.com", "Manager");
        app.addUser(user1);
        app.addUser(user2);
        System.out.println("Users added.");

        // Add employees
        Employee employee1 = new Employee("John", "john@example.com", "Engineer");
        Employee employee2 = new Employee("Alice", "alice@example.com", "Manager");
        app.addEmployee(employee1);
        app.addEmployee(employee2);
        System.out.println("Employees added.");

        // Add construction resources
        ConstructionResource resource1 = new ConstructionResource("Bricks", 1000);
        ConstructionResource resource2 = new ConstructionResource("Cement", 500);
        app.addResource(resource1);
        app.addResource(resource2);
        System.out.println("Construction resources added.");

        // Add needed resources
        ConstructionResource neededResource1 = new ConstructionResource("Steel", 200);
        ConstructionResource neededResource2 = new ConstructionResource("Wood", 300);
        app.addNeededResource(neededResource1);
        app.addNeededResource(neededResource2);
        System.out.println("Needed resources added.");

        // Send announcements
        String announcement = "Construction project update!";
        admin1.sendAnnouncement(announcement, app.getEmployees());
        System.out.println("Announcement sent.");
    }
}

