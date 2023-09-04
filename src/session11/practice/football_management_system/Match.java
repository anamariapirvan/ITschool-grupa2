package session11.practice.football_management_system;

public class Match {
    private Team homeTeam;
    private Team awayTeam;
    private int homeTeamGoals;
    private int awayTeamGoals;

    public Match(Team homeTeam, Team awayTeam){
        this.homeTeam=homeTeam;
        this.awayTeam=awayTeam;
        this.homeTeamGoals=0;
        this.awayTeamGoals=0;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeTeamGoals() {
        return homeTeamGoals;
    }

    public void setHomeTeamGoals(int homeTeamGoals) {
        this.homeTeamGoals = homeTeamGoals;
    }

    public int getAwayTeamGoals() {
        return awayTeamGoals;
    }

    public void setAwayTeamGoals(int awayTeamGoals) {
        this.awayTeamGoals = awayTeamGoals;
    }
    public void updateMatchResult( int homeTeamGoals, int awayTeamGoals){
        this.homeTeamGoals=homeTeamGoals;
        this.awayTeamGoals=awayTeamGoals;
    }

    public void displayMatchResult(){
        System.out.println("Match result is: ");
        System.out.println(homeTeam.getTeamName() + " " + homeTeamGoals + " - " + awayTeamGoals + " " + awayTeam.getTeamName());
    }
}
