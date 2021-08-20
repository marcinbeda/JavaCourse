package basicsPartTwo.encapsulation;


public class Encapsulation {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("aDrIaN");
        person.setAge(-99);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
