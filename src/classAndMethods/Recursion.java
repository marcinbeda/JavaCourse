package classAndMethods;

/**
 * Created by Marcin Beda.
 */

public class Recursion {
    public static void main(String[] args) {

        method();
        recursion(3);

        long start = System.currentTimeMillis();
        System.out.println(fibonacci(45));
        long end = System.currentTimeMillis() - start;
        System.out.println(end);
    }

    public static void method() {
        System.out.println("To byl zly pomysl...");
        method();
    }

    public static void recursion(int n) {
        if (n > 0) {
            recursion(n - 1);
            System.out.println(n);
        }
    }

    public static int fibonacci(int n) {
        final double PHI = (1 + Math.sqrt(5)) / 2;
        Double ntyWyraz = (Math.pow(PHI, n) - Math.pow((1 - PHI), n)) / Math.sqrt(5);
        return ntyWyraz.intValue();
    }

    public static int fibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }
    }
}
