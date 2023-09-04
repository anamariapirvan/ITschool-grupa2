package session11.practice.football_management_system;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private Coach coach;
    private List<Player> players;
    private int wins;
    private int losses;
    private int draws;

    public Team(String teamName, Coach coach) {
        this.teamName = teamName;
        this.coach = coach;
        this.players = new ArrayList<>();
        this.wins = 0;
        this.losses = 0;
        this.draws = 0;
    }


    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public Coach getCoach() {
        return coach;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public void updateMatchResult(int wins, int looses, int draws) {
        this.wins += wins;
        this.losses += looses;
        this.draws += draws;
    }

    public void displayTeamDetails() {
        System.out.println("Team name: " + teamName);
        System.out.println("Coach: " + coach.getName());
        System.out.println("Players: ");
        for (Player player : players) {
            System.out.println(player.getName());
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
    }
}
