package session12.homework.building_construction_application;

import java.util.List;

public class Team {
    private Employee teamLead;
    private List<Employee> members;

    public Team(Employee teamLead, List<Employee> members) {
        this.teamLead = teamLead;
        this.members = members;
    }

    public void addMember(Employee member) {
        members.add(member);
    }

    public void removeMember(Employee member) {
        members.remove(member);
    }

    public void changeTeamLead(Employee newTeamLead) {
        teamLead = newTeamLead;
    }
}
