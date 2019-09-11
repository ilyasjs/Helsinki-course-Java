
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = amountOfNumbers;
    }

    public void addNumber(int number) {
        // code here
        sum += number;
        amountOfNumbers++;

    }
        
    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }

    public int sum() {
        return sum;
    }
    

    public double average() {
        double avg = (double) sum / amountOfNumbers;
        if (amountOfNumbers == 0) {
            avg = 0;
            return avg;
        } else {
            return avg;
        }
    }
}
    