package intermediate.functionalProgramming.functionalInterfaces;


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
