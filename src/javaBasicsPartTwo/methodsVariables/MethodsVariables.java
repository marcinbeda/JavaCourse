package javaBasicsPartTwo.methodsVariables;

/**
 * Created by Marcin Beda.
 */

public class MethodsVariables {

    public static void main(String[] args) {
        add(2, 5);
        add(1, 10);
        add(5, 7);

        int[] a = {10};
        change(a);
        System.out.println("a = " + a[0]);
    }

    public static void change(int[] x) {
        x = new int[1];
        x[0] = 0;
        x[0]--;
        System.out.println("x = " + x[0]);
    }

    public static void add(int a, int b) {
        System.out.println("Suma = " + (a + b));
    }
}
