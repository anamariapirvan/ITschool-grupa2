package session12.homework.building_construction_application;


import java.util.List;

public class Admin implements User {
    @Override
    public void viewProgress() {
    }

    @Override
    public void interactWithData() {

    }

    @Override
    public void viewCompanyEmployees() {

    }

    @Override
    public void viewAvailableResources() {

    }

    @Override
    public void viewNeededResources() {

    }

    @Override
    public void viewTeamStructure() {

    }

    @Override
    public void changeTeamStructure() {

    }

    @Override
    public void changeEmployeeStructure() {

    }

    @Override
    public void sendAnnouncement(String announcement) {

    }

    public void sendAnnouncement(String announcement, List<Employee> employees) {
        for (Employee employee : employees) {
            String email = employee.getEmail();
            System.out.println("Announcement sent to " + employee.getName() + " at " + email);
        }
    }

    // Alte metode specifice Admin
    public void bringChangesToApplication() {
        System.out.println("Changes brought to the application by Admin.");
    }
}


