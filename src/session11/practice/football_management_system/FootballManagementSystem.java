package session11.practice.football_management_system;

import java.util.ArrayList;
import java.util.List;

public class FootballManagementSystem {

    public static void main(String[] args) {
        List<Player> playersList = new ArrayList<>();
        List<Coach> coaches = new ArrayList<>();

        Coach coach1 = new Coach("Coach1", "01-01-1970", 10, 10000);
        Coach coach2 = new Coach("Coach2", "01-01-1980", 15, 15000);

        Player player1 = new Player(43545, "Messi", "20-10-1980", "Quarterback", 20, 20000);
        Player player2 = new Player(465643, "Ronaldo", "25-06-1990", "Attacking", 30, 34000);
        Player player3 = new Player(5334, "Rolando", "19-08-1989", "Quarterback", 15, 15000);

        playersList.add(player1);
        playersList.add(player2);
        playersList.add(player3);

        coaches.add(new Coach("Coach1", "12-02-1990", 10, 200000));
        coaches.add(new Coach("Coach2", "15-04-1982", 15, 349875));

        Team team1 = new Team("TeamA", coach1);
        Team team2 = new Team("TeamB", coach2);

        team1.addPlayer(player1);
        team2.addPlayer(player2);
        team2.addPlayer(player3);

        System.out.println("Players: ");
        for (Player player : playersList) {
            System.out.println(player);
        }

        System.out.println("Coaches: ");
        for (Coach coach : coaches) {
            System.out.println(coach);
        }


        removePlayerByName(playersList, "Messi");
        removeCoachByName(coaches, "Coach1");

        // Update a player's goals scored
        updateGoalsScored(playersList, "Ronaldo", 35);

        // Display updated player information
        System.out.println("Updated Players details:");
        for (Player player : playersList) {
            System.out.println(player);
        }
        System.out.println("Updated Coaches details:");
        for (Coach coach : coaches) {
            System.out.println(coach);
        }

        Match match = new Match(team1, team2);
        match.updateMatchResult(2, 1);

        team1.displayTeamDetails();
        team2.displayTeamDetails();
        match.displayMatchResult();
    }


    public static void removePlayerByName(List<Player> players, String playerName) {
        for (Player player : players) {
            if (player.getName().equals(playerName)) {
                players.remove(player);
                break;
            }
        }
    }

    public static void removeCoachByName(List<Coach> coaches, String coachName) {
        for (Coach coach : coaches) {
            if (coach.getName().equals(coachName)) {
                coaches.remove(coach);
                break;
            }
        }
    }

    public static void updateGoalsScored(List<Player> players, String playerName, int newGoalsScored) {
        for (Player player : players) {
            if (player.getName().equals(playerName)) {
                player.setGoalScored(newGoalsScored);
            }
        }
    }


}


