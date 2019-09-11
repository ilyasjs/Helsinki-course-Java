/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {

        if (balance >= 2.50) {
            balance -= 2.50;
        } else {

        }
    }

    public void payGourmet() {
        if (balance >= 4.00) {
            balance -= 4.00;
        } else {

        }
    }

    public void loadMoney(double amount) {
        if (balance < 150) {
            if (amount >= 0) {
                balance += amount;
                if (balance > 150) {
                    balance = 150;
                } else {
                }
            }
        } else {
        }
    }
}
