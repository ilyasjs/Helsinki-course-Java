
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        // end loop with value -1
        System.out.println("Type numbers: ");
        int sum = 0;
        int count = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int i = Integer.parseInt(reader.nextLine());
            if (i > -1) {
                sum = sum + i;
                count = count + 1;
                average = (double) sum / count;
                if (i % 2 == 0) {
                    even = even + 1;
                } else {
                    odd = odd + 1;
                }
            }
            if (i == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("the sum is " + sum);
                System.out.println("How many numbers: " + count);
                System.out.println("Average: " + average);
                System.out.println("Even Numbers: " + even);
                System.out.println("Odd Numbers: " + odd);
                break;
            }

        }
    }
}
