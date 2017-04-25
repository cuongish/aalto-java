
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Top ten players based on goals");
        NHLStatistics.sortByGoals();  
        NHLStatistics.top(10);  
        
        System.out.println("Top 25 players based on penalties amounts");
        NHLStatistics.sortByPenalties();  
        NHLStatistics.top(25);
   
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");  // orders the players by penalty minutes

        System.out.println("Statistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");  // orders the players by penalty minutes
        NHLStatistics.sortByPoints();  // orders the players by penalty minutes

        
        System.out.println("Players in Anaheim Ducks");
        NHLStatistics.teamStatistics("ANA");  // orders the players by penalty minutes
        NHLStatistics.sortByPoints();  // orders the players by penalty minutes
    }
}
        