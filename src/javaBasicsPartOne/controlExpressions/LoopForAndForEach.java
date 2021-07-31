package javaBasicsPartOne.controlExpressions;

/**
 * Created by Marcin Beda.
 */

public class LoopForAndForEach {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " jest liczba parzysta.");
            } else {
                System.out.println(i + " jest liczba nieparzysta.");
            }
        }

        for (int i = 0, j = 10; i <= j; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }

        int[][] numbers = new int[][] {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        for (int[] x: numbers) {
            for (int y: x) {
                System.out.println("Pojedyncze elementy = " + y);
            }
        }
    }
}
