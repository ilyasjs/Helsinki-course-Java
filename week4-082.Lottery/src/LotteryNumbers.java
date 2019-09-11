
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random num = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        numbers.removeAll(numbers);
        int i = 1;
        while (i <= 7) {
            int number1 = num.nextInt(39) + 1;
            if (!containsNumber(number1)) {
                numbers.add(number1);
                i++;
            }
        }
    }
    // Write the number drawing here using the method containsNumber()

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (numbers.contains(number)) {
            return true;
        } else {
            return false;
        }
    }
}
