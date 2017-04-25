
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
            NHLStatistics.sortByPoints();  
            NHLStatistics.top(10);    // Print the top ten players sorted by points.
            } else if (command.equals("goals")) {
            System.out.println("Top ten players based on goals");
            NHLStatistics.sortByGoals();  
            NHLStatistics.top(10);    // Print the top ten players sorted by goals.
            } else if (command.equals("assists")) {
            NHLStatistics.sortByAssists();  
            NHLStatistics.top(10); //  Print the top ten players sorted by assists.
            } else if (command.equals("penalties")) {
            NHLStatistics.sortByPenalties();  
            NHLStatistics.top(10); //  Print the top ten players sorted by penalties.
            } else if (command.equals("player")) {
                System.out.println("Type a player's name: ");
                String name = reader.nextLine();
                NHLStatistics.searchByPlayer(name);  
                // Ask the user first which player's statistics are needed and then print them.
            } else if (command.equals("club")) {
                System.out.println("Type a club's abbreviation: ");
                String club = reader.nextLine();
                NHLStatistics.sortByPoints();     // orders the players by points
                NHLStatistics.teamStatistics(club);  
            }

        }
    }
}
