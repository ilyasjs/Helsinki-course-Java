/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Player {
    private String player;
    private int goals;
    
    public Player(String player) {
        this.player = player;
    }
    
    public Player(String player, int goals) {
        this.player = player;
        this.goals = goals;
    }
    
    public String getName() {
        return player;
    }
    
    public int goals() {
        return goals;
    }
    
    public String toString() {
        return getName() + ", " + goals();
    }
}
