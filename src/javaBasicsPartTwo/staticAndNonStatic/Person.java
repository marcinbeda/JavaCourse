package javaBasicsPartTwo.staticAndNonStatic;

/**
 * Created by Marcin Beda.
 */

public class Person {
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        population++;
    }

    String name;
    int age;

    static int population = 0;

    public static void inc() {
        population++;
    }
}
