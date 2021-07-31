package javaBasicsPartTwo.methodsOverload;

/**
 * Created by Marcin Beda.
 */

public class MethodsOverload {

    public static void main(String[] args) {
        System.out.println(add(5));
        System.out.println(add(5.0F));
        System.out.println(add(2, 8));
    }

    public static int add(float a) {
        return (int)--a;
    }

    public static int add(int a) {
        return ++a;
    }

    public static int add(int a, int b) {
        return a + b;
    }

}
