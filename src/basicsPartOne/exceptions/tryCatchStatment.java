package basicsPartOne.exceptions;

/**
 * Created by Marcin Beda.
 */

public class tryCatchStatment {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (ArithmeticException ex) {
            System.out.println("Wyjatek " + ex.toString() + " zostal zlapany i obsluzony.");
        } catch (NullPointerException ex) {
            // Obsluga drugiego wyjatku.
        } finally {
            System.out.println("Operacje na koniec.");
        }

        System.out.println("Jakies dodatkowe operacje...");
    }
}


