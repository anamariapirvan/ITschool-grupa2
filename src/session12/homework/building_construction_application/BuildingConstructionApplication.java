package session12.homework.building_construction_application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuildingConstructionApplication {
    private List<Admin> admins;
    private List<User> users;
    private List<Employee> employees;
    private List<ConstructionResource> resources;
    private List<ConstructionResource> neededResources;
    private List<Team> teams;

    BuildingConstructionApplication() {
        admins = new ArrayList<>();
        users = new ArrayList<>();
        employees = new ArrayList<>();
        resources = new ArrayList<>();
        neededResources = new ArrayList<>();
        teams = new ArrayList<>();
    }

    public void addAdmin(Admin admin) {
        admins.add(admin);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addResource(ConstructionResource resource) {
        resources.add(resource);
    }

    public void addNeededResource(ConstructionResource resource) {
        neededResources.add(resource);
    }

    public void createTeam(Employee teamLead, List<Employee> members) {
        Team team = new Team(teamLead, members);
        teams.add(team);
    }

    public void removeTeam(Team team) {
        teams.remove(team);
    }

    public void announce(String announcement) {
        for (User user : users) {
            user.sendAnnouncement(announcement);
        }
    }

    public List<Employee> getEmployees() {
        return Collections.emptyList();
    }
}
