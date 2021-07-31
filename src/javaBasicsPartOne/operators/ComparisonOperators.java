package javaBasicsPartOne.operators;

/**
 * Created by Marcin Beda.
 */

public class ComparisonOperators {

    public static void main(String[] args) {

        int a = 5;
        int b = 4;

        boolean c = a == b;

        System.out.println("Wynik działania 'a == b': " + (a == b));
        System.out.println("Wynik działania 'a != b': " + (a != b));
        System.out.println("Wynik działania 'a > b': " + (a > b));
        System.out.println("Wynik działania 'a < b': " + (a < b));
        System.out.println("Wynik działania 'a >= b': " + (a >= b));
        System.out.println("Wynik działania 'a <= b': " + (a <= b));
    }
}
