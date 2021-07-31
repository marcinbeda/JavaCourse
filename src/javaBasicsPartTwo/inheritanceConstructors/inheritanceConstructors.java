package javaBasicsPartTwo.inheritanceConstructors;

/**
 * Created by Marcin Beda.
 */

public class inheritanceConstructors {

    public static void main(String[] args) {
        Cat cat = new Cat("Sisi", 4, "czarny");
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.color);
    }
}
