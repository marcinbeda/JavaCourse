package basicsPartOne.classAndMethods.overridingMethods;

/**
 * Created by Marcin Beda.
 */

public class Figure {

    private double firstDimension;
    private double secondDimension;

    public Figure(double firstDimension, double secondDimension) {
        this.firstDimension = firstDimension;
        this.secondDimension = secondDimension;
    }

    public void calculateArea() {
        System.out.println("Nie wiem dla jakiej figury mam obliczac pole.");
    }
}
