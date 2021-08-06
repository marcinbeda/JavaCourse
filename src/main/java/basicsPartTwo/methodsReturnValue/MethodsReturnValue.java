package basicsPartTwo.methodsReturnValue;

/**
 * Created by Marcin Beda.
 */

public class MethodsReturnValue {

    public static void main(String[] args) {
        int sum = add(2, 5);
        System.out.println(sum);
        System.out.println(add(10, 5));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
