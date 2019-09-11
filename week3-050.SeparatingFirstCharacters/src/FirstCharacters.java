
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int i = 0;
        int j = 1;

        while (i <= 2) {
            if (name.length() > 2) {
                System.out.println(j + ". character: " + name.charAt(i));
            }
            i++;
            j++;
        }
    }
}
