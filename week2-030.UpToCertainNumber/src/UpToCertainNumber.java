
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int a = 1;
        System.out.println("Up to what number? ");
        int i = Integer.parseInt(reader.nextLine());
        while (a <= i) {
            System.out.println(a);
            a++;
        }
    }
}
