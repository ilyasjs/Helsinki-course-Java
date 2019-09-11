
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {

        for (int i = 0; i < width; i++) {
            
            Random random = new Random();
            double probability = random.nextDouble();
            if (probability < density) {
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }

    public void print() {
        starsInLastPrint = 0;
        for (int j = 0; j < height; j++) {
            this.printLine();
            
        }   
    }
    
    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}
