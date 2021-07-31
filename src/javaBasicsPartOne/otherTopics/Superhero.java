package javaBasicsPartOne.otherTopics;

/**
 * Created by Marcin Beda.
 */

public enum Superhero {
    BATMAN(10), SUPERMAN(5), WONDER_WOMAN(1);

    private int power;

    Superhero(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
