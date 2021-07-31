package javaBasicsPartOne.classAndMethods;

/**
 * Created by Marcin Beda.
 */

public class Spiderman extends Superhero {

    public Spiderman(int healthPoints, int strength, int dexterity, int endurance) {
        super(healthPoints, strength, dexterity, endurance);
    }

    public void wallsWalking() {
        System.out.println("Chodzi po scianach.");
    }
}
