package basicsPartOne.controlExpressions;

/**
 * Created by Marcin Beda.
 */

public class LablesAndBreakContinueStatment {
    public static void main(String[] args) {

        label1: for (int i = 0; i < 10; i++) {
            for (;;) {
                for (;;) {
                    break label1;
                }
            }
        }

        one: {
            two: {
                three: {
                    System.out.println("Poczatek trzeciego bloku.");
                    if (true) break two;
                    System.out.println("Koniec trzeciego bloku.");
                }
                System.out.println("Za trzecim blokiem.");
            }
            System.out.println("Za drugim blokiem.");
        }

        label2: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 2) continue label2;
                System.out.println("i = " + i + ", j = " + j);
            }
        }


    }
}
