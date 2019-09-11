
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        drawNumber();
        System.out.println("Guess a number: ");
        int guessedNumber = Integer.parseInt(reader.nextLine());

        int guessesMade = 0;
        if (guessedNumber == numberDrawn) {
            System.out.println("Congratulations, your guess is correct!");
            System.out.println("Guesses made: 1");
        } else {
            while (guessedNumber != numberDrawn) {
                guessesMade++;
                System.out.println("guesses Made: " + guessesMade);
                if (guessedNumber < numberDrawn) {
                    System.out.println("The number is greater");
                } else if (guessedNumber > numberDrawn) {
                    System.out.println("The number is lesser");
                }
                System.out.println("Guess a number: ");
                guessedNumber = Integer.parseInt(reader.nextLine());
                if (guessedNumber == numberDrawn) {
                    System.out.println("Congratulations, your guess is correct!");
                    guessesMade++;
                    System.out.println("Guesses Made: " + guessesMade);
                }
            }
        }

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
