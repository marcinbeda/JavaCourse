package javaBasicsPartOne.classAndMethods;

/**
 * Created by Marcin Beda.
 */

public class Superhero {

    private int healthPoints;
    private int strength;
    private int dexterity;
    private int endurance;

    public Superhero() {}

    public Superhero(int healthPoints, int strength, int dexterity, int endurance) {
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.dexterity = dexterity;
        this.endurance = endurance;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
}
