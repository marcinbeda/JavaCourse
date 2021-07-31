package javaBasicsPartTwo.staticAndNonStatic;

/**
 * Created by Marcin Beda.
 */

public class StaticAndNonStatic {

    public static void main(String[] args) {
        Person p1 = new Person("Adrian", 18);
        System.out.println(p1.population);
        Person p2 = new Person("Bartek", 22);

        System.out.println(p2.population);
        Person.inc();
        System.out.println(Person.population);
    }
}
