
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class Score {

    private ArrayList<Integer> scores;
    private ArrayList<Integer> grades;
    private int zero;

    public Score() {
        this.scores = new ArrayList<Integer>();
        this.grades = new ArrayList<Integer>();
    }

    public void addScore(int score) {
        if (score > 0 && score < 61) {
            scores.add(score);
        }
    }

    public void getScore() {
        for (Integer score : scores) {
            System.out.println(score);
        }
    }

    public void getGrade() {
        for (Integer point : scores) {
            if (point >= 50) {
                grades.add(5);
            } else if (point >= 45) {
                grades.add(4);
            } else if (point >= 40) {
                grades.add(3);
            } else if (point >= 35) {
                grades.add(2);
            } else if (point >= 30) {
                grades.add(1);
            } else {
                grades.add(0);
                zero++;
            }
        }
    }

    public void results() {
        System.out.println("");
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (Integer grade : grades) {
                if (i == grade) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
    public void acceptancePercentage() {
        
        if (!grades.isEmpty()) {
            double pass = 100 * (grades.size() - this.zero) / grades.size();
            System.out.println("Acceptance percentage: " + pass);
        }
        
    }

}
