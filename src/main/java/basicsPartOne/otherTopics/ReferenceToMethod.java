package basicsPartOne.otherTopics;

/**
 * Created by Marcin Beda.
 */

public class ReferenceToMethod {
    public static void main(String[] args) {

        ExampleClass exampleClass = new ExampleClass();

        ExampleInterface exampleInterface = ExampleClass::new;
        exampleInterface.runMethod();
    }
}

class ExampleClass {
    public void method() {
        System.out.println("To jest przykladowa metoda...");
    }
}

interface ExampleInterface {
    ExampleClass runMethod();
}