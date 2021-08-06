package basicsPartOne.controlExpressions;

/**
 * Created by Marcin Beda.
 */

public class OperatorInstanceof {
    public static void main(String[] args) {
        Float x = 10.0f;
        method(x);
    }

    private static void method(Number number) {
        if (number instanceof Integer) {
            System.out.println("Zmienna number jest typu Integer.");
        } else if (number instanceof Double) {
            System.out.println("Zmienna number jest typu Double.");
        } else {
            System.out.println("Blad.");
        }
    }
}
