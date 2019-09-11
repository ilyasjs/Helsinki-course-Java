
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int i = 0;
        int j = 1;
        int k = 1;
        while (i <= (name.length() - 1)) {
            if (name.length() - 1 >= k) {
                System.out.println(j + ". character: " + name.charAt(i));
                i++;
                j++;
            } else {
                break;
            }

        }
    }
}
