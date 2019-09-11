
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: "); // print to typr a word
        String word = reader.nextLine(); // allowing user to type a word
        
        System.out.print("Length of the first part: ");
        int length = Integer.parseInt(reader.nextLine());
        
        System.out.println("Result: " + word.substring(0, length));
        
    }
}
