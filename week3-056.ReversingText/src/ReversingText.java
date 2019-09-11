
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int i = 0;
        int textSize = text.length() - 1;
        String s = "";
        while (i <= textSize) {
            text.charAt(textSize - i);
            s = s + text.charAt(textSize - i);
            i++;

        }
        return s;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
