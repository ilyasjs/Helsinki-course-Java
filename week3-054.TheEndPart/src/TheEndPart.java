import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: "); // print to typr a word
        String word = reader.nextLine(); // allowing user to type a word
        
        System.out.print("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());
        int i = word.length() - 1;
        if (i >= length) {
        System.out.println("Result: " + word.substring(i - (length - 1)));
        } else {
            System.out.println("Result: " + word.substring(0));
        } 
    }
}
