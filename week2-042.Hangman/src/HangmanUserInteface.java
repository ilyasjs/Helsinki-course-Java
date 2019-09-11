
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");

        // PROGRAM YOUR SOLUTION HERE
        System.out.println("Type a command: ");
        while (hangman.gameOn()) {    
            String command = reader.nextLine();
            /*String winnie = "the pooh";
            if (winnie.isEmpty()) {
                System.out.println("String was empty");
                printMenu();                
            } else {
                System.out.println("I found something");
            }
            */
            if(command.length() == 1) {               
                hangman.guess(command);
            } 
            if ("quit".equals(command)) { 
                System.out.println("Thank you for playing!");
                break;
            } else if ("status".equals(command)){
                hangman.printStatus();
            } else if (command.isEmpty()){
                printMenu();
            } else {
                hangman.printMan();
                hangman.printWord();
            }
            System.out.println("Type a command: ");
        }
        
        
        //System.out.println("Thank you for playing!");
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
