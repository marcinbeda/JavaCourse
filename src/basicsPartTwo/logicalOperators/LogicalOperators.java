package basicsPartTwo.logicalOperators;

/**
 * Created by Marcin Beda.
 */

public class LogicalOperators {

    public static void main(String[] args) {
        boolean exampleVariable;
        exampleVariable = 2 == 1 || 5 > 10;
        exampleVariable = 2 == 2 && 15 > 10;
        exampleVariable = !true;

        exampleVariable = (true || false) && !false;

        System.out.println(exampleVariable);
    }
}
