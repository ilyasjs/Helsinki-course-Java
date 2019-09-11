
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        Database birds = new Database();
        while (true) {
            System.out.println("?");
            String answer = reader.nextLine();
            if (answer.equals("Add")) {
                System.out.println("Name: ");
                String birdName = reader.nextLine();

                System.out.println("Latin Name: ");
                String latinName = reader.nextLine();

                birds.addBird(birdName, latinName);
            } else if (answer.equals("Observation")) {
                System.out.println("What was observed:? ");
                String bird1 = reader.nextLine();
                birds.observation(bird1);
            } else if (answer.equals("Statistics")) {
                birds.statistics();
            } else if (answer.equals("Show")) {
                System.out.println("What? ");
                String bird = reader.nextLine();
                birds.show(bird);
            }
            if (answer.equals("Quit")) {
                break;
            }
        }
    }
}
