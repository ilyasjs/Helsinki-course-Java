
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        int radius = Integer.parseInt(reader.nextLine());
        System.out.print("Type your radius: ");
        
        System.out.println("Circumference of the circle: " + (2 * Math.PI * radius));
    }
}
