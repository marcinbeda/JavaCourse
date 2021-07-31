package javaBasicsPartTwo.arithmeticOperators;

/**
 * Created by Marcin Beda.
 */

public class ArithmeticOperators {

    public static void main(String[] args) {
        int addition = 2 + 2;
        int subtraction = 3 - 2;
        int multiplication = 2 * 3;
        int division = 6 / 2;
        int remainder = 8 % 3;

        System.out.format("Wynik dodawania: %d\n", addition);
        System.out.format("Wynik odejmowania: %d\n" ,subtraction);
        System.out.format("Wynik mnożenia: %d\n", multiplication);
        System.out.format("Wynik dzielenia: %d\n", division);
        System.out.format("Reszta z dzielenia: %d\n", remainder);

        System.out.println((2 + 2) * (2 + 2));

        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(9));
    }
}
