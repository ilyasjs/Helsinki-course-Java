
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        Score scores = new Score();
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        

        enterScore(lukija, scores);
        scores.getGrade();
        
        scores.results();
        
        scores.acceptancePercentage();
    }
    

    public static Score enterScore(Scanner scanner, Score score1) {
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int score = Integer.parseInt(scanner.nextLine());
            if (score == -1) {
                break;
            }
            score1.addScore(score);
        }
        return score1;
    }
}
