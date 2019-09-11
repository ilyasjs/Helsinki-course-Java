
public class BoundedCounter {

    // copy here the class BoundedCounter from last weeks assignment 78 

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;

    }

    public void next() {
        // write code here
        if (this.value == upperLimit) {
            value = 0;
        } else {
            value++;
        }
    }

    public String toString() {
        // write code here
        return "" + String.format("%02d", value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        if (newValue <= upperLimit && newValue >= 0) {
            value = newValue;
        }

    }
}