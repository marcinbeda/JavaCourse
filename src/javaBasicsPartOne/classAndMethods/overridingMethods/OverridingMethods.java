package javaBasicsPartOne.classAndMethods.overridingMethods;

/**
 * Created by Marcin Beda.
 */

public class OverridingMethods {
    public static void main(String[] args) {

        Figure[] figures = new Figure[] {
                new Figure(10, 10),
                new Rectangle(10, 10),
                new Triangle(10, 10)
        };

        for (Figure f: figures) {
            f.calculateArea();
        }
    }
}
