package javaBasicsPartTwo.multiplicationTable;

/**
 * Created by Marcin Beda.
 */

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(Integer.toString(i) + " * " + Integer.toString(j) + " = " + (i * j));
            }
        }

    }
}
