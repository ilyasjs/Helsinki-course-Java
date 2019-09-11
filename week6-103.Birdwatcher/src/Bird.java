/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Bird {
    private String name;
    private String latinName;
    private int numberOfObservations;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.numberOfObservations = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
     public String getLatinName() {
        return this.latinName;
    }
     
    public void numberOfObservations() {
        this.numberOfObservations++;
    }
    
    public int getObservations() {
        return this.numberOfObservations;
    }
     
     public String toString() {
         return this.name + " (" + this.latinName + "): " + this.numberOfObservations + 
                 " observations";
     }

}
