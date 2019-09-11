
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int result = 0;
        
        System.out.println("Until what? ");
        int num = Integer.parseInt(reader.nextLine());
        int i = 0;
        while (i <= num) {
            result = result + i;
            System.out.println("Sum is: " + result);
            i++;
            
        }
    }
}
