package basicsPartTwo.inheritanceMethods;


public class Animal {
    public Animal(String name) {
        this.name = name;
    }

    String name;

    public void getVoice() {
        System.out.println("Default voice");
    }
}
