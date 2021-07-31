package javaBasicsPartOne.classAndMethods;

/**
 * Created by Marcin Beda.
 */

final public class FinalKeyword {

    final private int FINAL_VARIABLE;

    FinalKeyword() {
        FINAL_VARIABLE = 10;
    }

    final public void test() {
        final int NEXT_FINAL_VARIABLE = 10;
        System.out.println(FINAL_VARIABLE + NEXT_FINAL_VARIABLE);
    }
}
