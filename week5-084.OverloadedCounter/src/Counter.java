/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Counter {

    private int startingValue;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, true);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return startingValue;
    }

    public void increase() {
        startingValue++;
    }

    public void decrease() {
        if (this.check == false) {
            startingValue--;
        } else if (this.startingValue != 0) {
            startingValue--;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            startingValue += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount >= 0) {
            if (this.check == true) {
                if (startingValue >= decreaseAmount) {
                    startingValue -= decreaseAmount;
                } else {
                    startingValue = 0;
                }
            } else {
                startingValue -= decreaseAmount;
            }
        }
    }
}
