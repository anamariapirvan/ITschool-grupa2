package session12.homework.building_construction_application;

public class Employee implements User {

    private String name;
    private String email;
    private String position;
    private Team team;

    public Employee(String name, String email, String position) {
        this.name = name;
        this.email = email;
        this.position = position;
    }

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

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void joinTeam(Team team) {
        this.team = team;
    }

    public void leaveTeam() {
        this.team = null;
    }
}
