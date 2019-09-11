import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        
        System.out.println("Type a number: ");
        int i = Integer.parseInt(reader.nextLine());
        int factorial = 1;
        while (i > 0) {
            factorial = i * factorial;
            
            i--;
            System.out.println("Factorial is " + factorial);
            
        }
    }
}
