package otherTopics;

/**
 * Created by Marcin Beda.
 */

public class ReferenceToMethod {
    public static void main(String[] args) {

        ExampleClass exampleClass = new ExampleClass();

        Interfejs interfejs = ExampleClass::new;
        interfejs.runMethod();
    }
}

class ExampleClass {
    public void method() {
        System.out.println("To jest przykladowa metoda...");
    }
}

interface Interfejs {
    ExampleClass runMethod();
}