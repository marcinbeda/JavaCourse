package basicsPartTwo.constructors;


public class Person {
    Person(String name) {
        this.name = name;
        age = -1;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;
}
