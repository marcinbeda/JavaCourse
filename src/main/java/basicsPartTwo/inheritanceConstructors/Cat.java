package basicsPartTwo.inheritanceConstructors;

/**
 * Created by Marcin Beda.
 */

public class Cat extends Animal {
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    String color;
}
