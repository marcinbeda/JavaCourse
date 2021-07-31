package javaBasicsPartTwo.inheritance;

/**
 * Created by Marcin Beda.
 */

public class Inheritance {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();

        cat.getVoice();
        cat.eat();

        Tiger tiger = new Tiger();

    }
}
