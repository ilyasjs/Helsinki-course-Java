
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        int num2 = Integer.parseInt(reader.nextLine());     
        while (num1 <= num2) {
            System.out.println(num1);
            num1++;
        }
    }
}
