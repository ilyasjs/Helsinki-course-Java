
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        System.out.print("Type a word: ");
        String word = reader.nextLine();

        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            words.add(word);
            System.out.print("Type a word: ");
            word = reader.nextLine();
            if (words.contains(word)) {
                for (String word1 : words) {
                }
                System.out.println("You gave the word " + word + " twice");
                break;
            }
        }
    }
}
