package javaBasicsPartOne.operators;

/**
 * Created by Marcin Beda.
 */

public class TernaryOperator {

    public static void main(String[] args) {

        int a = 3;
        int b = 1;

        int c = (a > b) ? 10 : 0;

        System.out.println((a > b) ? "Tak" : "Nie");

        System.out.println(isBiggerThan(a, b) ? multiplyBy100(a) : multiplyBy100(b));
    }

    public static int multiplyBy100(int value) {
        return value * 100;
    }

    public static boolean isBiggerThan(int a, int b) {
        return a > b;
    }
}
