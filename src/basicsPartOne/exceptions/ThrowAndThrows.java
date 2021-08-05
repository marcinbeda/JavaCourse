package basicsPartOne.exceptions;

import java.io.IOException;

/**
 * Created by Marcin Beda.
 */

public class ThrowAndThrows {
    public static void main(String[] args) {

        try {
            divisionTwoNumbers(5, 0);
        } catch (ArithmeticException ex) {
            System.out.println("Wyjatek \"" + ex.toString() + "\" zostal zlapany i obsluzony.");
        } catch (IOException ex) {
            System.out.println("Blad wejscia-wyjscia.");
        } catch (Exception ex) {
            System.out.println("Dodatkowa obsluga wyjatkow.");
        }
    }

    public static double divisionTwoNumbers(double a, double b) throws IOException {
        if (b == 0) {
            throw new IOException("Dzielenie przez zero.");
        } else {
            return a / b;
        }
    }
}
