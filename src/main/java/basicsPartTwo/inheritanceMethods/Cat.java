package basicsPartTwo.inheritanceMethods;


public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void getVoice() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "I'm " + super.name;
    }
}
