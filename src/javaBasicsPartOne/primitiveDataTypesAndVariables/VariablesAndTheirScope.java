package javaBasicsPartOne.primitiveDataTypesAndVariables;

/**
 * Created by Marcin Beda.
 */

public class VariablesAndTheirScope {

    int variable1 = 10;
    boolean variable2 = true;
    Class variable3 = new Class();
    String variable4 = new String();
    String variable5 = new String("Hello World!");
    String variable = "Hello World!";

    public static void main(String[] args) {

//        String a = new String("Hello World!");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(a);
//        }

//        for (int i = 0; i < 10; i++) {
//            int a = i;
//            // Code.
//        }
//
//        int b = 10;
//        int c = a + b; // error

//        if (true) {
//            int h = 0; // Zmienna "h" zyje tylko w obrebie bloku "if".
//        }

        int a = 0;

        for (int i = 0; i < 10; i++) {
            a = i;
            // Code.
        }

        int b = 10;
        int c = a + b;
    }
}
