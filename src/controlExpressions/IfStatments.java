package controlExpressions;

/**
 * Created by Marcin Beda.
 */

public class IfStatments {
    public static void main(String[] args) {

        double a = 5;
        double b = 0;
        double c;

        if (b != 0) {
            c = a / b;
        } else if (a != 0) {
            System.out.println("Jesteśmy w bloku else if");
        } else if (true) {
            // Operacje.
        } else {
            System.out.println("Nie można dzielić przez zero!");
        }

        if (true) c = a / b;
        else {
            System.out.println("Nie można dzielić przez zero!");
            System.out.println("Nie można dzielić przez zero!");
        }

        if (true) {
            if (true) {
                // Operacje.
            } else {
                // Operacje.
            }
        } else if (false) {
            // Operacje.
        } else {
            // Operacje.
        }
    }
}
