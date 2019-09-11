
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @ author Dell
 */
public class Database {

    private ArrayList<Bird> birds;

    public Database() {
        this.birds = new ArrayList<Bird>();
    }

    public void addBird(String birdName, String latinName) {
        birds.add(new Bird(birdName, latinName));

    }

    public void observation(String bird1) {
        for (Bird bird : birds) {
            if (!bird.getName().contains(bird1)) {
                System.out.println("Is not a bird!");
            } else {
                bird.numberOfObservations();
            }
        }
    }

    public void statistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void show(String bird) {
        for (Bird bird1 : birds) {
            if (bird1.getName().contains(bird)) {
                System.out.println(bird1);
            }
        }
    }
}
