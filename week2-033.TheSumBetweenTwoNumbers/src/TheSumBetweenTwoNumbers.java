
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First: ");
        int num1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Last: ");
        int num2 = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        
        while (num1 <= num2){
            sum = sum + num1;
            num1++;
            System.out.println("the sum " + sum);
        }
            
    }
}
