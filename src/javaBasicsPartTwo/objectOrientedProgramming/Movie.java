package javaBasicsPartTwo.objectOrientedProgramming;

/**
 * Created by Marcin Beda.
 */

public class Movie {
    String title = "Default";
    int year;
    public void info() {
        System.out.println("Nazwa: " + title + ", rok: " + year);
    }
}
