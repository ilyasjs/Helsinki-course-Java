import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        //print top 10 players based on goals
        System.out.println("Top ten players based on goals"); 
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        //Top 25 players based on penalty amount
        System.out.println("Top 25 players based on penalty amount");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        //Statistics for Sidney Crosby
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        //Statispics for Philadelphia Flyers
        System.out.println("Statispics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        
        //Players in Anaheim Ducks ordered by points
        System.out.println("Players in Anaheim Ducks ordered by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
    }
}
