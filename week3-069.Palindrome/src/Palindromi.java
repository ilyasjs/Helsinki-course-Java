
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        int i = 0;
        int textSize = text.length() - 1;
        String s = "";
        while (i <= textSize) {
            text.charAt(textSize - i);
            s = s + text.charAt(textSize - i);
            i++;

        }
        if (s.equals(text)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
