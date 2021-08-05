package intermediate.functionalProgramming.functionalInterfaces;

/**
 * Created by Marcin Beda.
 */

public class LambdaExpressions {

    public static void main(String[] args) {

        Runnable ru = () -> System.out.println("A");
        Runnable ra = () -> System.out.println("B");

        test("A", ra);
        test("B", ru);
    }

    public static void test(String name, Runnable a) {
    }
}
