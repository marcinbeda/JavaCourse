package javaBasicsPartOne.basicsJava;

import javaBasicsPartOne.myFirstPackage.MyFirstClass;

/**
 * Created by Marcin Beda.
 */

public class SampleClass {

    // Pola
    private MyFirstClass myFirstClass;
    private int x;
    private int y;

    // Domyslny konstruktor
    public SampleClass() {

    }

    // Konstruktor przeciazony.
    public SampleClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Wewnetrzna metoda.
    private int addTwoNumbers(int x, int y) {

        Test test = new Test();

        return x + y;
    }

    // Klasa wewnetrzna
    private class Test {

    }

    // Gettery i settery.
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
