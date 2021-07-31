package javaBasicsPartTwo.constructors;

/**
 * Created by Marcin Beda.
 */

public class Constructors {

    public static void main(String[] args) {
        Person p1 = new Person("Adrian", 18);
        Person p2 = new Person("Bartek");

        System.out.println(p1.name + ", " + p1.age);
        System.out.println(p2.name + ", " + p2.age);
    }
}
